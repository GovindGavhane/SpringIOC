package com.jsp;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.jsp")
public class MyConfig {
	
	@Bean
	public ArrayList getArrayList()
	{
		return new ArrayList();
	}

	@Bean
	public Set getSet()
	{
		return new TreeSet();
	}
}
