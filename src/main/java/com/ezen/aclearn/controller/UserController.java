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
	
	// ȸ������ ȭ������ �̵�
	@GetMapping("/join.do")
	public String joinView() {
		return "user/join";
	}
	
	// ȸ������ ����
	@PostMapping(value="/join.do", produces="application/text; charset=UTF-8")
    public String join(UserVO userVO, Model model) {
		int joinResult = userService.join(userVO);
      
		if(joinResult == 0) {
			model.addAttribute("joinMsg", "ȸ�����Կ� �����ϼ̽��ϴ�. �����ڿ��� �������ּ���.");
			return "/user/join";
		} 
		model.addAttribute("joinMsg", "ȸ�����Կ� �����߽��ϴ�. �α������ּ���.");
		return "user/login";
	}
	
	// �α��� ȭ������ �̵�
	@GetMapping("/login.do")
	public String loginView() {
		return "user/login";
	}
	// �α��� ����
	@PostMapping("/login.do")
	@ResponseBody
	public String login(UserVO userVO, HttpSession session) {
		
		// 1.���̵� üũ
		int idCheck = userService.idCheck(userVO.getUserId());
		System.out.println(idCheck);
	    if(idCheck < 1) {
		   return "idFail";
	    } else {
		   UserVO loginUser = userService.login(userVO);
		   
		   // 2. ��й�ȣ üũ
		   if(loginUser == null) {
			   return "pwFail";
		   }
		   // 3. �α��� ����
		   // ���ǿ� �α����� ������ ������ ��Ƽ� 
		   session.setAttribute("loginUser", loginUser);
		   return "loginSuccess";
	    }
	}
	// ���̵� ã�� ȭ������ �̵�
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

	// ��й�ȣ ã�� ȭ������ �̵�
	@RequestMapping(value = "/searchPw.do", method = RequestMethod.GET)
	public String searchPw(HttpServletRequest request, Model model,
	        UserVO searchVO) {
	    
	    return "/user/searchPw";
	}
	
	
	
	// �α׾ƿ�
	@GetMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/index.jsp";
	   }
	
	// ���̵� �ߺ�üũ
	@PostMapping("/idCheck.do")
	@ResponseBody
	public String idCheck(UserVO userVO) throws JsonProcessingException {
		

		String returnStr ="";
		int idCnt=userService.idCheck(userVO.getUserId());
		
		// �ߺ� (���̵� DB�� ���� ��)
		if(idCnt > 0) { 
			returnStr ="duplicatedId";

		}else {
			returnStr = "idOk";
		}
		return returnStr;
		
	}
	
	// �г��� �ߺ�üũ
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
