package com.durgesh;

import java.io.Serializable;

public class Student implements Serializable
{
	private static final long serialVersionUID = -1515840032609928305L;
	private String name;
	private String usn;
	private Marks marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", usn=" + usn + ", Marks=" + marks + "]";
	}
	
}
