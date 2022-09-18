package org.zerock.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.zerock.domain.SignupVO;
import org.zerock.mapper.LoginDAO;

@Service
public class LoginServiceImpl implements Loginservice {

	@Inject
	private LoginDAO loginDao;

	@Override
	public String loginCheck(SignupVO vo, HttpSession session) {
		String username =loginDao.loginCheck(vo);
		
		if (username != null) {
	
			session.setAttribute("username", vo.getUsername());
			session.setAttribute("password", vo.getPassword());
			}
			 return username; 
			}

	@Override
	public void logout(HttpSession session) {
		session.invalidate(); // 세션 초기화
	}


}
