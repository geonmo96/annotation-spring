package com.care.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.care.dao.TestDAO;
@Service
public class MyServiceImpl implements MyService{
	@Autowired
	@Qualifier("testDAO")
	private TestDAO dao;
	public MyServiceImpl() {
		System.out.println("서비스 생성자 실행");
	}
	@Override
	public void execute() {
		//dao = new TestDAO();
		dao.test();
	}
}
