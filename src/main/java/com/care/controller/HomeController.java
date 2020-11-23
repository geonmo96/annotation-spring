package com.care.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
//@Controller
//@Service
//@Repository
@Component
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private TestClass testClass;
	public HomeController() {
		// 객체 생성 여부를 확인하기 위한 생성자
		System.out.println("HomeController 생성자 실행 !!");
		/* 기존에 사용하던 xml파일로 동작
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:config/context-config.xml");
		testClass = ctx.getBean("testClass", TestClass.class);
		testClass.print(); */
		System.out.println("생성자 testClass(생성자) : " + testClass);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		System.out.println("생성자 testClass(기본경로) : " + testClass);
		testClass.print();
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
