package com.ezen.aclearn.service.user;

import com.ezen.aclearn.vo.UserVO;

public interface UserService {
	// ȸ������
	int join(UserVO userVO);
	
	// �α���
	UserVO login(UserVO userVO);
	
	// ���̵� �ߺ�üũ
	int idCheck(String userId);
	
	// ���̵� ã��
	String searchId(UserVO searchVO);
		
	// ��й�ȣ ã��
	UserVO searchPw(UserVO searchVO);
	
	// �г��� �ߺ�üũ
	int nicknameCheck(String userNickname);
	
	
	
}
