//package org.zerock.service;
//
//import javax.inject.Inject;
//
//import org.apache.ibatis.session.SqlSession;
//import org.springframework.stereotype.Repository;
//import org.zerock.domain.SignupVO;
//import org.zerock.mapper.SignupDAO;
//
//@Repository
//public class SignupDAOImpl implements SignupDAO{
//	@Inject
//    private SqlSession session;
// 
//    @Override
//    public void insertMember(SignupVO signVO) {
//    	 session.insert("insertMember",signVO);
//    }
//    
//}
