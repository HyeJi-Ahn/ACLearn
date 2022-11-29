package com.ezen.aclearn.service.cmnt.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.aclearn.vo.CmntVO;

@Repository
public class CmntDAO {
	@Autowired
	private SqlSessionTemplate mybatis;

	public List<CmntVO> getCmntList(Map<String, String> paramMap) {
		return mybatis.selectList("CmntDAO.getCmntList", paramMap);
	}

	public CmntVO getCmnt(int cmntCode) {
		return mybatis.selectOne("CmntDAO.getCmnt", cmntCode);
	}

	public void updateCmntCnt(int cmntCode) {
		mybatis.update("CmntDAO.updateCmntCnt", cmntCode);
	}

	public void updateCmnt(CmntVO cmntVO) {
		mybatis.update("CmntDAO.updateCmnt", cmntVO);
	}

	public int insertCmnt(CmntVO cmntVO) {
		mybatis.insert("CmntDAO.insertCmnt", cmntVO);
		return cmntVO.getCmntCode();
	}

	public void deleteCmnt(int cmntCode) {
		mybatis.update("CmntDAO.deleteCmnt", cmntCode);
	}
	
	
}
