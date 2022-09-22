package org.zerock.controller;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.zerock.domain.SignupVO;
import org.zerock.service.Loginservice;
import org.zerock.service.SignupService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@AllArgsConstructor
@Log4j
@Controller
@RequestMapping("/login/*")
public class LoginController {
	
	@Inject
	@Autowired
	private Loginservice loginservice;
	
	
	@RequestMapping("login.do")
	public String login() {
		return "login/login";
	}
	@RequestMapping("login_check.do")
	public ModelAndView login_check(@ModelAttribute SignupVO vo, HttpSession session) {
		String username = loginservice.loginCheck(vo, session);
		
		
		ModelAndView mav = new ModelAndView();
		if (username != null) {
			mav.setViewName("home");
		} else {
			mav.setViewName("login/login");
			mav.addObject("message", "error");
		}
		return mav;
	}
	@RequestMapping("logout.do")
	public ModelAndView logout(HttpSession session, ModelAndView mav) {
		loginservice.logout(session);
		mav.setViewName("login/login");
		mav.addObject("message", "logout");
		return mav;
				
	}

}
