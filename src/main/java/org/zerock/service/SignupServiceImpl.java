package org.zerock.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.SignupVO;
import org.zerock.mapper.SignupDAO;


@Service
public class SignupServiceImpl implements SignupService{
	@Inject
    private SignupDAO dao;
 
    @Override
    public void insertMember(SignupVO signVO) {
        dao.insertMember(signVO);
    }

	@Override
	public int idcheck(String username) {
		// TODO Auto-generated method stub
		return 0;
	}
}
   


