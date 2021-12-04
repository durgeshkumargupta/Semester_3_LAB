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

	}

}
