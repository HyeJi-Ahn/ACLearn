package com.ezen.aclearn.service.user.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.aclearn.vo.UserVO;

@Repository
public class UserDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	// ȸ������
	public int join(UserVO userVO) {
		 return mybatis.insert("UserDAO.join",userVO);
	}
	
	// �α��� 
	public UserVO login(UserVO userVO) {
		return mybatis.selectOne("UserDAO.login",userVO);
	}
	
	// ���̵� üũ
	public int idCheck(String userId) {
		return mybatis.selectOne("UserDAO.idCheck",userId);
	}
	
	// ���̵� ã��
	public String searchId(UserVO searchVO) {
		return mybatis.selectOne("UserDAO.searchId",searchVO);
	}
	// ��й�ȣ ã��
	public UserVO searchPw(UserVO searchVO) {
		return mybatis.selectOne("UserDAO.serchPw",searchVO);
	}
	
	// �г��� �ߺ�üũ
	public int nicknameCheck(String userNickname) {
		return mybatis.selectOne("userDAO.nicknameCheck", userNickname);
	}
}
