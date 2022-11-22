package com.ezen.aclearn.service.mypage.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.aclearn.service.mypage.MyPageService;

@Service
public class MyPageServiceImpl implements MyPageService {
	@Autowired
	private MyPageDAO myPageDAO;
}
