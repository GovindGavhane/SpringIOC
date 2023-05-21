package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonDriver {

	public static void main(String[] args) {
		 
		ApplicationContext context = new AnnotationConfigApplicationContext("com.jsp");
		Person person =(Person) context.getBean("myPerson");
		System.out.println(person.arrayList);
		System.out.println(person.set);

	}

}
