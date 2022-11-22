package com.ezen.aclearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.aclearn.service.mypage.MyPageService;
import com.ezen.aclearn.vo.LctrVO;
import com.ezen.aclearn.vo.UserVO;

@Controller
@RequestMapping("/mypage")
public class MyPageController {
	@Autowired
	private MyPageService mypageService;
	
	public List getLctrList(LctrVO lctrVO) {
		
		return null;
	}
	
	public void updUser(UserVO userVO) {
		
	}
	
	public void quitUser(UserVO userVO) {
		
	}
}
