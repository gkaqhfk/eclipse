package org.zerock.mapper;

import org.zerock.domain.SignupVO;

public interface SignupDAO {
	//ȸ������ DAO
    public void insertMember(SignupVO signVO);
    
    public void idcheck(SignupVO signVO);
}
