package com.jsp.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;

public class PersonController {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("com.jsp");
		PersonDao dao = (PersonDao) context.getBean("dao");
		Person person = new Person();
		person.setName("Rama");
		person.setEmail("gavhaneg771@gmail.com");
		person.setAge(23);
		Person p = dao.savePerson(person);
		System.out.println(" person inserted successfully :" + p.getId());

	}

}
