package com.ezen.aclearn.service.cmnt.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CmntDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
}
