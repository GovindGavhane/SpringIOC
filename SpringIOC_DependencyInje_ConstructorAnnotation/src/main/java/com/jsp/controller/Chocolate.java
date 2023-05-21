package com.jsp.controller;

import org.springframework.stereotype.Component;

@Component("chocolate")
public class Chocolate implements IceCreame {

	public void eat() {

       System.out.println(" baby eat chocolate icecreame");
		
	}

}
