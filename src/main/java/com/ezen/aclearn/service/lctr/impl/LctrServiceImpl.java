package com.ezen.aclearn.service.lctr.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.aclearn.service.lctr.LctrService;

@Service
public class LctrServiceImpl implements LctrService {
	@Autowired
	private LctrDAO lctrDAO;
}
