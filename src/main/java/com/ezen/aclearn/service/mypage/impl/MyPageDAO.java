package com.ezen.aclearn.service.mypage.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MyPageDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
}
