package com.durgesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
		
		Marks marks=(Marks)ctx.getBean(Marks.class);
		marks.setM1(98);
		marks.setM2(88);
		marks.setM3(79);
		
		Student s=ctx.getBean(Student.class);
		s.setName("Durgesh");
		s.setUsn("1RV20MC015");
		s.setMarks(marks);
		
		System.out.println(s);
		
		System.out.println("______________scope of Student______________");
		Student s2=ctx.getBean(Student.class);
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println("______________scope of Marks______________");
		Marks mark2=(Marks)ctx.getBean(Marks.class);
		System.out.println(marks.hashCode());
		System.out.println(mark2.hashCode());

	}

}
