package com.ezen.aclearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ezen.aclearn.service.lctr.LctrService;
import com.ezen.aclearn.vo.LctrVO;
import com.ezen.aclearn.vo.ReviewVO;

@Controller
@RequestMapping("/lctr")
public class LctrController {
	@Autowired
	private LctrService lctrService;
	
	public void addLctr(LctrVO lctrVO) {
		
	}
	
	public void delLctr(LctrVO lctrVO) {
		
	}
	
	public void updLctr(LctrVO lctrVO) {
		
	}
	
	@RequestMapping("/getLctrList.do")
	public String getLctrList(Model model) {
		List<LctrVO> lctrList = lctrService.getLctrList();
		
		model.addAttribute("lctrList", lctrList);
		
		return "lctr/getLctrList";
	}
	
	@RequestMapping("/getLctr.do")
	public String getLctr(@RequestParam("lctrCode") int lctrCode, String userId, Model model) {
		// 강의 상세보기
		LctrVO lctr = lctrService.getLctr(lctrCode);
		model.addAttribute("lctr", lctr);
		
		return "lctr/getLctr";
	}
	
	public void addLike() {
		
	}
	
	public void delLike() {
		
	}
	
	public void addReview(ReviewVO reviewVO) {
		
	}
	
	public void delReview() {
		
	}
	
	public void updReview(ReviewVO reviewVO) {
		
	}
	
	public void addUserLctr(LctrVO lctrVO) {
		
	}	
	
}
