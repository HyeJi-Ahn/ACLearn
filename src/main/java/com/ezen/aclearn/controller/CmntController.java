package com.ezen.aclearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ezen.aclearn.service.cmnt.CmntService;
import com.ezen.aclearn.vo.CmntVO;
import com.ezen.aclearn.vo.ReplyVO;

@Controller
@RequestMapping("/cmnt")
public class CmntController {
	@Autowired
	private CmntService cmntService;
	
	// 커뮤니티 목록 화면
	@GetMapping("/getCmntList.do")
	public String getCmntList(Model model) {
		List<CmntVO> cmntList = cmntService.getCmntList();
		model.addAttribute("cmntList", cmntList);
		return "cmnt/getCmntList";
	}
	
	// 커뮤니티 글 상세보기
	@RequestMapping("/getCmnt.do")
	public String getCmnt(@RequestParam("cmntNo") int cmntNo, Model model) {
		CmntVO cmnt = cmntService.getCmnt(cmntNo);
		model.addAttribute("cmnt", cmnt);		
		return "cmnt/getCmnt";
	}
	
	// 커뮤니티 글 작성
	public void addCmnt(CmntVO cmntVO) {
		
	}
	
	// 커뮤니티 글 수정
	public void updCmnt(CmntVO cmntVO) {
		
	}
	
	// 커뮤니티 글 삭제
	public void delCmnt() {
		
	}
	
	// LIKE
	public void addLike() {
		
	}
	
	// LIKE 취소
	public void delLike() {
		
	}
	
	// 댓글 작성
	public void addReply(ReplyVO replyVO) {
		
	}
	
	// 댓글 수정
	public void updReply(ReplyVO replyVO) {
		
	}
	
	// 댓글 삭제
	public void delReply() {
		
	}
		
}
