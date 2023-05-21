package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PhoneDriver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-arg.xml");
		SmartPhone phone = (SmartPhone) context.getBean("myPhone");
		System.out.println(phone.sim.getNumber());
		System.out.println(phone.sim.getService());
	}

}
