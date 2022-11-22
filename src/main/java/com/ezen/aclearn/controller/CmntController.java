package com.ezen.aclearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.aclearn.service.cmnt.CmntService;
import com.ezen.aclearn.vo.CmntVO;
import com.ezen.aclearn.vo.ReplyVO;

@Controller
@RequestMapping("/cmnt")
public class CmntController {
	@Autowired
	private CmntService cmntService;
	
	public List getCmntList(CmntVO cmntVO) {
		
		return null;
	}
	
	public CmntVO getCmnt() {
		
		return null;
	}
	
	public void addLike() {
		
	}
	
	public void delLike() {
		
	}
	
	public void addCmnt(CmntVO cmntVO) {
		
	}
	
	public void delCmnt() {
		
	}
	
	public void updCmnt(CmntVO cmntVO) {
		
	}
	
	public void addReply(ReplyVO replyVO) {
		
	}
	
	public void delReply() {
		
	}
	
	public void updReply(ReplyVO replyVO) {
		
	}
}
