package com.ezen.aclearn.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.aclearn.service.user.UserService;
import com.ezen.aclearn.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	
	// ȸ������
	@Override
	public int join(UserVO userVO) {
		return userDAO.join(userVO); 
	}
	
	// �α���
	@Override
	public UserVO login(UserVO userVO) {
		return userDAO.login(userVO);
	}
	
	// ���̵� �ߺ�üũ
	@Override
	public int idCheck(String userId) {
		System.out.println("service====================" + userId);
		return userDAO.idCheck(userId);
	}
	
	// ���̵� ã��
	@Override
	public String searchId(UserVO searchVO) {
		return userDAO.searchId(searchVO);
	}
	// ��й�ȣ ã��
	@Override
	public UserVO searchPw(UserVO searchVO) {
		return userDAO.searchPw(searchVO);
	}
	
	// �г��� �ߺ�üũ
	@Override
	public int nicknameCheck(String userNickname) {
		return userDAO.nicknameCheck(userNickname);
	}
}
