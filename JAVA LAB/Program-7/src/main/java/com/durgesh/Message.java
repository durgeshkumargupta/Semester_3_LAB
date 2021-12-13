package com.durgesh;

import javax.persistence.*;

import org.springframework.data.annotation.Persistent;

@Entity
@Table(name = "Message")
public class Message {
	@Id
	private int mid;
	private String message;

	public Message() {
	}

	public Message(int mid, String message) {
		super();
		this.mid = mid;
		this.message = message;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
