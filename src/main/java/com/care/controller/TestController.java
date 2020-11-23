package com.care.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.application.AC;
import com.care.service.MyService;
import com.care.service.MyServiceImpl;
import com.care.service.MyServiceImplB;

@Controller
public class TestController {
	//@Autowired
	//private MyService ms;
	// @Autowired가 동작할 때 상속받는 클래스가 여러개 있다면 어느걸 연결할지 몰라 에러?가 발생하거나 오동작을 할 수 있다.
	// 밑에 예시처럼 나눠서 사용할 수도 있음
//	@Autowired
//	private MyServiceImpl msi;
//	@Autowired
//	private MyServiceImplB msb;
	
	private MyService ms;
	private ApplicationContext ac = AC.applicationContext;
	@RequestMapping("test")
	public void test() {
		//ms = new MyServiceImpl();
		//msi.execute();
		
		ms = (MyServiceImpl)ac.getBean("myServiceImpl");
		ms.execute();
	}
	@RequestMapping("test02")
	public void test02() {
		//msb.execute();
		
		ms = (MyServiceImplB)ac.getBean("myServiceImplB");
		ms.execute();
	}
}
