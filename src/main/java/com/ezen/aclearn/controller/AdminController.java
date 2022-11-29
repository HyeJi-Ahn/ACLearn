package com.ezen.aclearn.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ezen.aclearn.service.admin.AdminService;
import com.ezen.aclearn.service.cmnt.CmntService;
import com.ezen.aclearn.vo.CmntVO;
import com.ezen.aclearn.vo.LctrVO;
import com.ezen.aclearn.vo.ReviewVO;
import com.ezen.aclearn.vo.UserVO;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private CmntService cmntService;
	
	public List getLctrList(LctrVO lctrVO) {
		
		return null;
	}
	
	public List getUserList(UserVO userVO) {
		
		return null;
	}
	
	public String getCmntList(Model model, @RequestParam Map<String, String> paramMap) {
		List<CmntVO> cmntList = cmntService.getCmntList(paramMap);
		
		model.addAttribute("cmntList", cmntList);
		
		return "cmnt/getCmntList";
	}
	
	public void updLctrState(LctrVO lctrVO) {
		
	}
	
	@PostMapping("updCmntState.do")
	public String updCmntState(CmntVO cmntVO) {
		return null;
		
	}
	
	public void updReviewState(ReviewVO reviewVO) {
		
	}
}
