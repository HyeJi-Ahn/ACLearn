package com.ezen.aclearn.service.cmnt.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.aclearn.vo.CmntVO;

@Repository
public class CmntDAO {
	@Autowired
	private SqlSessionTemplate mybatis;

	public List<CmntVO> getCmntList() {
		return mybatis.selectList("CmntDAO.getCmntList");
	}

	public CmntVO getCmnt(int cmntNo) {
		return mybatis.selectOne("CmntDAO.getCmnt", cmntNo);
	}
}
