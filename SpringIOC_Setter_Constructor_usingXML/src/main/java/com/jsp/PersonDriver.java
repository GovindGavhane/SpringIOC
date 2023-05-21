package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDriver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("person.xml");
		Person person = (Person) context.getBean("myPerson");
		Phone phone = (Phone) context.getBean("myPhone");
		System.out.println(person.getName()+" "+person.getAge());
		System.out.println("------------------------------------");
		System.out.println(phone.name+" "+phone.ram);
		
	}

}
