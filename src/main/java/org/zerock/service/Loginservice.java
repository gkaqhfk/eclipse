package org.zerock.service;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.zerock.domain.SignupVO;

@Service
public interface Loginservice {
	public String loginCheck(SignupVO vo, HttpSession session);
	
	
	public void logout(HttpSession session);
	
}
