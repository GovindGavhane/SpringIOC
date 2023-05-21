package com.jsp.controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("vanilla")
@Primary
public class Vanilla implements IceCreame {

	public void eat() {
		 System.out.println("baby started vanilla Icecreame");
		
	}

}
