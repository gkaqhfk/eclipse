package org.zerock.mapper;

import org.zerock.domain.SignupVO;

public interface MypageDAO {
	
		
		//R: ȸ�� ���� ��ȸ - ����� ID �ش��ϴ� ���� ��������
		public SignupVO readMember(String username) throws Exception;
		
		//R: ȸ�� ���� ��ȸ - ID,PW������ �ش��ϴ� ����� ����
		public SignupVO readMemberWithIDPW(String username,String password) throws Exception;

		//U: ȸ����������
		public void updateMember(SignupVO vo) throws Exception;
		
		//D: ȸ��Ż��
		public void deleteMember(SignupVO vo) throws Exception;
}
