package com.ezen.aclearn.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.aclearn.service.user.UserService;
import com.ezen.aclearn.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	
	// 회원가입
	@Override
	public int join(UserVO userVO) {
		return userDAO.join(userVO); 
	}
	
	// 로그인
	@Override
	public UserVO login(UserVO userVO) {
		return userDAO.login(userVO);
	}
	
	// 아이디 중복체크
	@Override
	public int idCheck(String userId) {
		System.out.println("service====================" + userId);
		return userDAO.idCheck(userId);
	}
	
	// 아이디 찾기
	@Override
	public String searchId(UserVO searchVO) {
		return userDAO.searchId(searchVO);
	}
	// 비밀번호 찾기
	@Override
	public UserVO searchPw(UserVO searchVO) {
		return userDAO.searchPw(searchVO);
	}
	
	// 닉네임 중복체크
	@Override
	public int nicknameCheck(String userNickname) {
		return userDAO.nicknameCheck(userNickname);
	}
}
