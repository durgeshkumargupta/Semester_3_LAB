package com.durgesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// Lab Program-05
public class AppTest 
{
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/durgesh/StudentBean2.xml");
		
		Student s1=(Student)context.getBean("student");
		System.out.println(s1);
		
		Student s2=(Student)context.getBean("student2");
		System.out.println(s2);
	}

}
