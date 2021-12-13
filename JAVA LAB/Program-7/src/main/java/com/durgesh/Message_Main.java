package com.durgesh;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Message_Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.scan("com.durgesh");
		appContext.refresh();
		MessageService messageService = (MessageService) appContext.getBean("MessageService");
		messageService.Save(10, "Durgesh");
		messageService.Save(21, "Ayush");
		List<Message> al = messageService.getMessages();
		for (Message m : al) {
			System.out.println(m.getMid() + " " + m.getMessage());
		}
		appContext.close();
	}
}