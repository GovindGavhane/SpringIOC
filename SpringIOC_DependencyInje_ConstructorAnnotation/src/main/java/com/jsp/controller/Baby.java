package com.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("baby")
public class Baby {
	
	@Autowired
//	@Qualifier("vanilla")
	IceCreame icecreame;

}
