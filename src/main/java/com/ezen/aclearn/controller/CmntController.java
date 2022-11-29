package com.ezen.aclearn.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.ezen.aclearn.service.cmnt.CmntService;
import com.ezen.aclearn.vo.CmntVO;
import com.ezen.aclearn.vo.ReplyVO;
import com.ezen.aclearn.vo.UserVO;

@Controller
@RequestMapping("/cmnt")
public class CmntController {
	@Autowired
	private CmntService cmntService;
	
	// 커뮤니티 목록 화면
	@RequestMapping("/getCmntList.do")
	public String getCmntList(Model model, @RequestParam Map<String, String> paramMap) {
		List<CmntVO> cmntList = cmntService.getCmntList(paramMap);
		
		model.addAttribute("cmntList", cmntList);
		
		if(paramMap.get("searchCondition") != null && !paramMap.get("searchCondition").equals(""))
			model.addAttribute("searchCondition", paramMap.get("searchCondition"));
		if(paramMap.get("searchKeyword") != null && !paramMap.get("searchKeyword").equals(""))
			model.addAttribute("searchKeyword", paramMap.get("searchKeyword"));
		
		return "cmnt/getCmntList";
	}
	
	// 커뮤니티 글 상세보기
	@RequestMapping("/getCmnt.do")
	public String getCmnt(@RequestParam("cmntCode") int cmntCode, Model model) {
		CmntVO cmnt = cmntService.getCmnt(cmntCode);
		model.addAttribute("cmnt", cmnt);		
		return "cmnt/getCmnt";
	}
	
	// 조회수 증가
	@RequestMapping("/updateCmntCnt.do")
	public String updateCmntCnt(@RequestParam("cmntCode") int cmntCode) {
		cmntService.updateCmntCnt(cmntCode);
		
		return "redirect:/cmnt/getCmnt.do?cmntCode=" + cmntCode;
	}
	
	/*
	// 커뮤니티 글 등록 화면으로 이동
	@GetMapping("/insertCmnt.do")
	public String insertCmntView(HttpSession session) {
		UserVO loginUser = (UserVO)session.getAttribute("loginUser");
		
		if(loginUser == null) {
			return "redirect:/user/login.do";
		}
		return "cmnt/insertCmnt";
	}
	
	// 커뮤니티 글 등록
	@GetMapping("/insertCmnt.do")
	public String insertCmnt(CmntVO cmntVO, MultipartFile[] uploadFiles, HttpServletRequest request) {
		int cmntCode = cmntService.insertCmnt(cmntVO);
		
		// 파일업로드 기능 구현
		if(uploadFiles.length > 0) {
			List<CmntVO> fileList = new ArrayList<CmntVO>();
			
			// 업로드 폴더 지정
			// request.getSession().getServletContext().getRealPath("/"): WAS의 루트패스
			String attachPath = request.getSession().getServletContext().getRealPath("/")
					+ "/upload/";
			
			File directory = new File(attachPath);
			
			// 해당 폴더가 존재하지 않으면 폴더 생성
			if(!directory.exists()) {
				directory.mkdir();
			}
		}
		// 등록 후 게시글 목록으로 이동
		return "redirect:/cmnt/getCmntList.do";
	}
	*/
	
	// 커뮤니티 글 수정
	@PostMapping("updateCmnt.do")
	public String updateCmnt(CmntVO cmntVO) {
		cmntService.updateCmnt(cmntVO);
		
		return "redirect:/cmnt/getCmnt.do=?cmntCode=" + cmntVO.getCmntCode();
	}
	
	// 커뮤니티 글 삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteCmnt(int cmntCode) {
		cmntService.deleteCmnt(cmntCode);
		
		return "redirect:/cmnt/getCmntList.do";
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
