/*
package org.zerock.service;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.zerock.domain.SignupVO;
import org.zerock.mapper.MypageDAO;

@Service

@Repository
public class MypageDAOImpl implements MypageDAO {
	@Autowired
	@Inject
	private SqlSession sqlSession;

	private static final String namespace = "org.zerock.mapper.MypageDAO";

	@Override
	public SignupVO readMember(String username) throws Exception {

		SignupVO vo = sqlSession.selectOne(namespace + ".readMember", username); 
		return vo;
	}

	@Override
	public SignupVO readMemberWithIDPW(String username, String password) throws Exception {

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("username", username);
		paramMap.put("password", password);

		return sqlSession.selectOne(namespace + ".readMemberWithIDPW", paramMap);
	}

	@Override
	public void updateMember(SignupVO vo) throws Exception {
		sqlSession.update(namespace + ".updateMember", vo);
	}

	@Override
	public void deleteMember(SignupVO vo) throws Exception {
		int check = sqlSession.delete(namespace + ".deleteMember", vo);
		System.out.println("DAO : deleteMember() " + check);
	}
}

*/