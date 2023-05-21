package com.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="myPerson")
public class Person {
	
	PAN pan;

	@Autowired
	public void setPan(PAN pan) {
		this.pan = pan;
	}
	
	
	

}
