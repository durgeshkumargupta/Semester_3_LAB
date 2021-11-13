package com.durgesh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig
{

	@Bean
	public HelloWorld helloWorld()
	{
		System.out.println("java Based Configuration");
		return new HelloWorld();
	}
}
