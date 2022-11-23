package com.ezen.aclearn.service.cmnt.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.aclearn.service.cmnt.CmntService;
import com.ezen.aclearn.vo.CmntVO;

@Service
public class CmntServiceImpl implements CmntService {
	@Autowired
	private CmntDAO cmntDAO;

	@Override
	public List<CmntVO> getCmntList() {
		return cmntDAO.getCmntList();
	}

	@Override
	public CmntVO getCmnt(int cmntNo) {
		return cmntDAO.getCmnt(cmntNo);
	}
}
