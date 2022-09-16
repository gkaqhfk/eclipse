package org.zerock.service;

import org.zerock.domain.SignupVO;

public interface SignupService {
	  //회원가입 Service
    public void insertMember(SignupVO signVO);
    
    public int idcheck(String username);
}
