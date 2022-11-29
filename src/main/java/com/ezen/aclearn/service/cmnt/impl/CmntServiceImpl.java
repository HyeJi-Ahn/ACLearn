package com.ezen.aclearn.service.cmnt.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.aclearn.service.cmnt.CmntService;
import com.ezen.aclearn.vo.CmntVO;

@Service
public class CmntServiceImpl implements CmntService {
	@Autowired
	private CmntDAO cmntDAO;
	
	@Override
	public List<CmntVO> getCmntList(Map<String, String> paramMap) {
		return cmntDAO.getCmntList(paramMap);
	}
	
	@Override
	public CmntVO getCmnt(int cmntCode) {
		return cmntDAO.getCmnt(cmntCode);
	}

	@Override
	public void updateCmntCnt(int cmntCode) {
		cmntDAO.updateCmntCnt(cmntCode);
	}

	@Override
	public void updateCmnt(CmntVO cmntVO) {
		cmntDAO.updateCmnt(cmntVO);		
	}

	@Override
	public int insertCmnt(CmntVO cmntVO) {
		return cmntDAO.insertCmnt(cmntVO);
	}

	@Override
	public void deleteCmnt(int cmntCode) {
		cmntDAO.deleteCmnt(cmntCode);		
	}
}
