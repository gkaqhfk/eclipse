package org.zerock.mapper;

import org.springframework.stereotype.Service;
import org.zerock.domain.SignupVO;


public interface LoginDAO {
	String loginCheck(SignupVO vo);
}
