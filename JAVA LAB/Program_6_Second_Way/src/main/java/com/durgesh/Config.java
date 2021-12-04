package com.durgesh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config 
{
	
	@Bean
	public Student setBeanStudent()
	{
		return new Student();
	}
	
	@Bean
	public Marks setBeanMarks()
	{
		return new Marks();
	}
}
