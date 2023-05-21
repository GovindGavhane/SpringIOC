package com.jsp;

import java.util.ArrayList;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myPerson")
public class Person {
	
	@Autowired
	ArrayList arrayList;
	
	@Autowired
	Set set;
	

}
