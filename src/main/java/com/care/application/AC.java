package com.care.application;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class AC implements ApplicationContextAware{ // ac : applicationContext
	public static ApplicationContext applicationContext;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// 자동적으로 실행
		// container에 저장되어 있는 bean들을 가져올 수 있음
		System.out.println("자동으로 실행된다");
		this.applicationContext = applicationContext;
	}
}
