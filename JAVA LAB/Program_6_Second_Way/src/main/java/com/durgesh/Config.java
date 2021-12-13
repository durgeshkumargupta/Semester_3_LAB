package com.durgesh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config 
{
	
	@Bean
	@Scope("prototype")
	public Student setBeanStudent()
	{
		return new Student();
	}
	
	@Bean
	@Scope("singleton")
	public Marks setBeanMarks()
	{
		return new Marks();
	}
}
