package org.zerock.service;

import org.zerock.domain.SignupVO;

public interface SignupService {

    void insertMember(SignupVO signVO);
    
    int idcheck(SignupVO signVO);

}
