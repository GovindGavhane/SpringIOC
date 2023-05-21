package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaptopDriver {

	public static void main(String[] args) {

      ApplicationContext context = new AnnotationConfigApplicationContext("com.jsp");
      LapTop laptop = (LapTop) context.getBean("myLaptop");
      System.out.println("Id :"+laptop.id);
      System.out.println("name :"+laptop.name);
      System.out.println("Ram :"+laptop.ram);

	}

}
