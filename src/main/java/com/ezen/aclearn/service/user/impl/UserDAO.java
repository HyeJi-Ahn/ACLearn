package com.ezen.aclearn.service.user.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.aclearn.vo.UserVO;

@Repository
public class UserDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	// 회원가입
	public int join(UserVO userVO) {
		 return mybatis.insert("UserDAO.join",userVO);
	}
	
	// 로그인 
	public UserVO login(UserVO userVO) {
		return mybatis.selectOne("UserDAO.login",userVO);
	}
	
	// 아이디 체크
	public int idCheck(String userId) {
		return mybatis.selectOne("UserDAO.idCheck",userId);
	}
	
	// 아이디 찾기
	public String searchId(UserVO searchVO) {
		return mybatis.selectOne("UserDAO.searchId",searchVO);
	}
	// 비밀번호 찾기
	public UserVO searchPw(UserVO searchVO) {
		return mybatis.selectOne("UserDAO.serchPw",searchVO);
	}
	
	// 닉네임 중복체크
	public int nicknameCheck(String userNickname) {
		return mybatis.selectOne("userDAO.nicknameCheck", userNickname);
	}
}
