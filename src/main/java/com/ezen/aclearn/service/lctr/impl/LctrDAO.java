package com.ezen.aclearn.service.lctr.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.aclearn.vo.LctrVO;

@Repository
public class LctrDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<LctrVO> getLctrList() {
		return mybatis.selectList("LctrDAO.getLctrList");
	}
	
	public LctrVO getLctr(int lctrCode) {
		return mybatis.selectOne("LctrDAO.getLctr", lctrCode);
	}
}
