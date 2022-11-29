package com.ezen.aclearn.service.lctr.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.aclearn.service.lctr.LctrService;
import com.ezen.aclearn.vo.LctrVO;

@Service
public class LctrServiceImpl implements LctrService {
	@Autowired
	private LctrDAO lctrDAO;
	
	@Override
	public List<LctrVO> getLctrList() {
		return lctrDAO.getLctrList();
	}
	
	@Override
	public LctrVO getLctr(int lctrCode) {
		return lctrDAO.getLctr(lctrCode);
	}
}
