package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dto.Person;

@Component("dao")
public class PersonDao {
	
	@Autowired
	EntityManagerFactory factory;
	
	@Autowired
	EntityManager manager;
	
	public Person savePerson(Person person)
	{
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(person);
		transaction.commit();
		return person;
		
	}
	
	
	

}
