package org.zerock.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.zerock.domain.SignupVO;
import org.zerock.service.Loginservice;

import org.zerock.service.MypageServiceImpl;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import oracle.net.aso.v;

@AllArgsConstructor
@Log4j
@Controller
@RequestMapping("/mypage/*")
public class MyPageController {
	@Autowired
	private MypageServiceImpl service;
	
	@RequestMapping("mypage.do")
	public String mypage() throws Exception{
		return "/mypage/mypage";
	}
	
	//회원 정보 보기 
	@RequestMapping(value = "/mypage/info", method = RequestMethod.GET)
	public void infoGET(HttpSession session, Model model) throws Exception{

		//세션 객체 안에 있는 ID정보 저장
		String username = (String) session.getAttribute("username");
		log.info("C: 회원정보보기 GET의 아이디 "+ username);

		//서비스안의 회원정보보기 메서드 호출
		SignupVO vo = service.readMember(username);

		//정보저장 후 페이지 이동
		model.addAttribute("SingVO", vo);
		log.info("C: 회원정보보기 GET의 VO "+ vo);
		
	}
	//회원 정보 수정
	@RequestMapping(value = "/mypage/mypageupdate", method = RequestMethod.GET)
	public String updateGET(HttpSession session, Model model) throws Exception{
		log.info("C: 회원정보수정 입력페이지 POST");
		
		model.addAttribute("SingupVO", service.readMember((String)session.getAttribute("username")));

		return "/mypage/updateForm";
	}
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String updatePOST(SignupVO vo) throws Exception{
		log.info("C: 회원정보수정 입력페이지 POST");

		service.updateMember(vo);
		return "/mypage/info";
	}
	//회원정보 삭제
	@RequestMapping(value = "/mypage/delete", method = RequestMethod.GET)
	public String deleteGET(HttpSession session) throws Exception{
		log.info("C: 회원정보 삭제 GET");
		// 세션제어
		String username = (String) session.getAttribute("username");
		if(username == null) {
			return "redirect: /includes/header";
		}
		return "/mypage/deleteForm";			
	}
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deletePOST(SignupVO vo, HttpSession session) throws Exception{
		log.info("C: 회원정보 삭제 POST");
		//1. 파라미터값 저장
		log.info("C: deleteForm전달정보 "+vo);
		// 2. 전달받은 정보를 가지고 삭제 동작 처리이동
		// 3. service 객체 - 동작
		service.deleteMember(vo);
		// 4. 세션초기화
		session.invalidate();
		// 5. 페이지 이동
		return "redirect:/includes/header";			
	}
}
