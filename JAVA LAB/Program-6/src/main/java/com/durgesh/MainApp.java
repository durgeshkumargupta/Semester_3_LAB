package com.durgesh;
// Lab Program -06
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp 
{
	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		
		HelloWorld s1=(HelloWorld)context.getBean(HelloWorld.class);
		System.out.println(s1);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Can you tell your message:");
		String str=sc.nextLine();
		s1.setMessage(str);
		System.out.println("Your Message is:");
		System.out.println(s1.getMessage());
		
	}

}
