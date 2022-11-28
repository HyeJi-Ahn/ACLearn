package com.ezen.aclearn.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ezen.aclearn.service.user.UserService;
import com.ezen.aclearn.vo.UserVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	// 회원가입 화면으로 이동
	@GetMapping("/join.do")
	public String joinView() {
		return "user/join";
	}
	
	// 회원가입 진행
	@PostMapping(value="/join.do", produces="application/text; charset=UTF-8")
    public String join(UserVO userVO, Model model) {
		int joinResult = userService.join(userVO);
      
		if(joinResult == 0) {
			model.addAttribute("joinMsg", "회원가입에 실패하셨습니다. 관리자에게 문의해주세요.");
			return "/user/join";
		} 
		model.addAttribute("joinMsg", "회원가입에 성공했습니다. 로그인해주세요.");
		return "user/login";
	}
	
	// 로그인 화면으로 이동
	@GetMapping("/login.do")
	public String loginView() {
		return "user/login";
	}
	// 로그인 진행
	@PostMapping("/login.do")
	@ResponseBody
	public String login(UserVO userVO, HttpSession session) {
		
		// 1.아이디 체크
		int idCheck = userService.idCheck(userVO.getUserId());
		System.out.println(idCheck);
	    if(idCheck < 1) {
		   return "idFail";
	    } else {
		   UserVO loginUser = userService.login(userVO);
		   
		   // 2. 비밀번호 체크
		   if(loginUser == null) {
			   return "pwFail";
		   }
		   // 3. 로그인 성공
		   // 세션에 로그인한 유저의 정보를 담아서 
		   session.setAttribute("loginUser", loginUser);
		   return "loginSuccess";
	    }
	}
	// 아이디 찾기 화면으로 이동
	@RequestMapping(value = "/searchId.do", method = RequestMethod.GET)
	public String searchIdView(HttpServletRequest request, Model model,
	        UserVO searchVO) {
	    
	    return "/user/searchId";
	}
	
	@PostMapping("/searchId.do")
	@ResponseBody
	public String searchId(UserVO userVO) throws JsonProcessingException {
		String userId = userService.searchId(userVO);
		
		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> resultMap = new HashMap<String, String>();
		
		if(userId != null) {
			resultMap.put("msg", "ok");
			resultMap.put("searchId", userId);
		} else {
			resultMap.put("msg", "fail");
		}
		
		String jsonStr = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(resultMap);
		
		return jsonStr;
	}

	// 비밀번호 찾기 화면으로 이동
	@RequestMapping(value = "/searchPw.do", method = RequestMethod.GET)
	public String searchPw(HttpServletRequest request, Model model,
	        UserVO searchVO) {
	    
	    return "/user/searchPw";
	}
	
	
	
	// 로그아웃
	@GetMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/index.jsp";
	   }
	
	// 아이디 중복체크
	@PostMapping("/idCheck.do")
	@ResponseBody
	public String idCheck(UserVO userVO) throws JsonProcessingException {
		

		String returnStr ="";
		int idCnt=userService.idCheck(userVO.getUserId());
		
		// 중복 (아이디가 DB에 있을 때)
		if(idCnt > 0) { 
			returnStr ="duplicatedId";

		}else {
			returnStr = "idOk";
		}
		return returnStr;
		
	}
	
	// 닉네임 중복체크
	@PostMapping("/nicknameCheck.do")
	@ResponseBody
	public String nicknameCheck(UserVO userVO) throws JsonProcessingException {
		

		String returnStr ="";
		int nickCnt=userService.idCheck(userVO.getUserNickname());
		
		if(nickCnt > 0) {
			returnStr ="duplicatedNickname";
			
		}else {
			returnStr = "nicknameOk";
		}
		return returnStr;
		
	}
//	
//	public void logout(UserVO userVO) {
//		
//	}
//	
//	public void quitUser(UserVO userVO) {
//		
//	}
	
}
