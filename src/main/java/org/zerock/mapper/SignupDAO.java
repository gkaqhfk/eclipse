package org.zerock.mapper;

import org.zerock.domain.SignupVO;

public interface SignupDAO {
	//회원가입 DAO
    public void insertMember(SignupVO signVO);
    
    public void idcheck(SignupVO signVO);
}
