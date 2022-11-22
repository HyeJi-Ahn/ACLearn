package com.ezen.aclearn.service.lctr.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LctrDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
}
