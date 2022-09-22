package org.zerock.mapper;

import org.zerock.domain.SignupVO;

public interface MypageDAO {
	
		
		//R: 회원 정보 조회 - 사용자 ID 해당하는 정보 가져오기
		public SignupVO readMember(String username) throws Exception;
		
		//R: 회원 정보 조회 - ID,PW정보에 해당하는 사용자 정보
		public SignupVO readMemberWithIDPW(String username,String password) throws Exception;

		//U: 회원정보수정
		public void updateMember(SignupVO vo) throws Exception;
		
		//D: 회원탈퇴
		public void deleteMember(SignupVO vo) throws Exception;
}
