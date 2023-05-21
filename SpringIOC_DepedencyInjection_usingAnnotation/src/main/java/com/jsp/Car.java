package com.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="myCar")
public class Car {
	
	@Autowired
	Engine engine;

}
