package com.ezen.aclearn.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
/**
 * 메인페이지 ui 호출
 * parameter 
 * return 
 *  - /ACLearn/src/main/webapp/WEB-INF/views/main.jsp
 */	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main(Locale locale, Model model, HttpServletRequest request, HttpSession session) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); // 서버 시간 입니다.
		
		return "main";
	}

/**
 * 로그인 ui 호출 
 * parameter 
 *  - 
 * return 
 *  - /ACLearn/src/main/webapp/WEB-INF/views/login.jsp
 */
	/*
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login(Locale locale, Model model, HttpServletRequest request, HttpSession session) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		
		
		return "login";
	}	
	*/
/**
 * 로그인 인증 
 * parameter 
 * return 
 */
	/*
	@RequestMapping(value = "/setLogin.do", method = RequestMethod.GET)
	public ModelAndView setLogin(Locale locale, Model model, HttpServletRequest request, HttpSession session) {
		//logger.info("Welcome home! The client locale is {}.", locale);
		ModelAndView mv = new ModelAndView();
		
		
		return mv;
	}	
	*/	

	
}
