package com.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="myLaptop")
public class LapTop {
	
	@Value("1")
	public int id;
	
	  String name;
	
	@Value("GG")
	public void setName(String name)
	{
		this.name=name;
	}
	
	  int ram;
	
	LapTop(@Value("4")int ram)
	{
		this.ram=ram;
	}
	

}
