package org.zerock.service;

import org.zerock.domain.SignupVO;

public interface SignupService {
	  //ȸ������ Service
    public void insertMember(SignupVO signVO);
    
    public int idcheck(String username);
}
