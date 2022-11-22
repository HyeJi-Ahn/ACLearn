package com.ezen.aclearn.service.cmnt.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.aclearn.service.cmnt.CmntService;

@Service
public class CmntServiceImpl implements CmntService {
	@Autowired
	private CmntDAO cmntDAO;
}
