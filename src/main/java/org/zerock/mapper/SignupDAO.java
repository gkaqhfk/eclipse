package org.zerock.mapper;

import org.zerock.domain.SignupVO;

public interface SignupDAO {

    void insertMember(SignupVO signVO);

    int idcheck(SignupVO signVO);

}
