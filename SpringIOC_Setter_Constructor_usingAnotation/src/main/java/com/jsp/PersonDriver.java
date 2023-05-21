package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonDriver {
	
	public static void main(String[] args) {
		ApplicationContext contex = new AnnotationConfigApplicationContext("com.jsp");
		Person person = (Person)contex.getBean("MP");
		person.print();
	}
	

}
