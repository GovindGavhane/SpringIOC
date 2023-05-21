package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarDriver {
	
	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext("com.jsp");
		Car car = (Car) context.getBean("myCar");
		car.engine.E();
	}

}
