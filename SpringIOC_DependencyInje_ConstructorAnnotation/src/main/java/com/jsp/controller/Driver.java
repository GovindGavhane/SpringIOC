package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		 
		ApplicationContext context = new AnnotationConfigApplicationContext("com.jsp");
		Baby baby = (Baby) context.getBean("baby");
		baby.icecreame.eat();

	}

}
