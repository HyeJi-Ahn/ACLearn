package com.ezen.aclearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.aclearn.service.user.UserService;
import com.ezen.aclearn.vo.UserVO;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	public void join(UserVO userVO) {
		
	}
	
	public UserVO login(UserVO userVO) {
		
		return null;
	}
	
	public void logout(UserVO userVO) {
		
	}
	
	public void quitUser(UserVO userVO) {
		
	}
	
}
