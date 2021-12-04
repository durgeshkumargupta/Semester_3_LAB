package com.durgesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass 
{
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/durgesh/config.xml");
		
		Ticket c1=(Ticket)ctx.getBean("ticket");
		System.out.println(c1);
	}
}
