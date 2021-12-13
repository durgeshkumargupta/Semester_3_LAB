package com.durgesh;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MessageService")
public class MessageService {

	@Autowired
	MessageRepository ar;

	public void Save(int mid, String message) {
		Message m = new Message();
		m.setMid(mid);
		m.setMessage(message);
		ar.save(m);
	}

	public List<Message> getMessages() {
		List<Message> al = (List<Message>) ar.findAll();
		return al;
	}
}
