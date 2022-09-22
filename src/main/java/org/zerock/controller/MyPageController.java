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
	
	//ȸ�� ���� ���� 
	@RequestMapping(value = "/mypage/info", method = RequestMethod.GET)
	public void infoGET(HttpSession session, Model model) throws Exception{

		//���� ��ü �ȿ� �ִ� ID���� ����
		String username = (String) session.getAttribute("username");
		log.info("C: ȸ���������� GET�� ���̵� "+ username);

		//���񽺾��� ȸ���������� �޼��� ȣ��
		SignupVO vo = service.readMember(username);

		//�������� �� ������ �̵�
		model.addAttribute("SingVO", vo);
		log.info("C: ȸ���������� GET�� VO "+ vo);
		
	}
	//ȸ�� ���� ����
	@RequestMapping(value = "/mypage/mypageupdate", method = RequestMethod.GET)
	public String updateGET(HttpSession session, Model model) throws Exception{
		log.info("C: ȸ���������� �Է������� POST");
		
		model.addAttribute("SingupVO", service.readMember((String)session.getAttribute("username")));

		return "/mypage/updateForm";
	}
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String updatePOST(SignupVO vo) throws Exception{
		log.info("C: ȸ���������� �Է������� POST");

		service.updateMember(vo);
		return "/mypage/info";
	}
	//ȸ������ ����
	@RequestMapping(value = "/mypage/delete", method = RequestMethod.GET)
	public String deleteGET(HttpSession session) throws Exception{
		log.info("C: ȸ������ ���� GET");
		// ��������
		String username = (String) session.getAttribute("username");
		if(username == null) {
			return "redirect: /includes/header";
		}
		return "/mypage/deleteForm";			
	}
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String deletePOST(SignupVO vo, HttpSession session) throws Exception{
		log.info("C: ȸ������ ���� POST");
		//1. �Ķ���Ͱ� ����
		log.info("C: deleteForm�������� "+vo);
		// 2. ���޹��� ������ ������ ���� ���� ó���̵�
		// 3. service ��ü - ����
		service.deleteMember(vo);
		// 4. �����ʱ�ȭ
		session.invalidate();
		// 5. ������ �̵�
		return "redirect:/includes/header";			
	}
}
