package com.ezen.aclearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	public List getLctrList(LctrVO lctrVO) {
		
		return null;
	}
	
	public LctrVO getLctr() {
		
		return null;
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
