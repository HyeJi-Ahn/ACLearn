package com.ezen.aclearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.aclearn.service.admin.AdminService;
import com.ezen.aclearn.vo.CmntVO;
import com.ezen.aclearn.vo.LctrVO;
import com.ezen.aclearn.vo.ReviewVO;
import com.ezen.aclearn.vo.UserVO;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	public List getLctrList(LctrVO lctrVO) {
		
		return null;
	}
	
	public List getUserList(UserVO userVO) {
		
		return null;
	}
	
	public void updLctrState(LctrVO lctrVO) {
		
	}
	
	public void updCmntState(CmntVO cmntVO) {
		
	}
	
	public void updReviewState(ReviewVO reviewVO) {
		
	}
}
