package com.ezen.aclearn.service.user;

import com.ezen.aclearn.vo.UserVO;

public interface UserService {
	// 회원가입
	int join(UserVO userVO);
	
	// 로그인
	UserVO login(UserVO userVO);
	
	// 아이디 중복체크
	int idCheck(String userId);
	
	// 아이디 찾기
	String searchId(UserVO searchVO);
		
	// 비밀번호 찾기
	UserVO searchPw(UserVO searchVO);
	
	// 닉네임 중복체크
	int nicknameCheck(String userNickname);
	
	
	
}
