package org.zerock.service;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.SignupVO;
import org.zerock.mapper.MypageDAO;
import org.zerock.mapper.SignupDAO;

@Service
public class MypageServiceImpl implements MypageDAO {
	@Inject
	@Autowired
	private MypageDAO dao;

	// ȸ������ ����
	@Override
	public SignupVO readMember(String username) {
		System.out.println("S : readMember()����");
		SignupVO vo = null;

		try {
			vo = dao.readMember(username);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}

	// ȸ�� ���� ����
	@Override
	public void deleteMember(SignupVO vo) {
		try {
			dao.deleteMember(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public SignupVO readMemberWithIDPW(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMember(SignupVO vo) throws Exception {
		dao.updateMember(vo);
		
	}

}
