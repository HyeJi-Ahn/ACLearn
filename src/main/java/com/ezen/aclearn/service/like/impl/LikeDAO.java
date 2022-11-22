package com.ezen.aclearn.service.like.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LikeDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
}
