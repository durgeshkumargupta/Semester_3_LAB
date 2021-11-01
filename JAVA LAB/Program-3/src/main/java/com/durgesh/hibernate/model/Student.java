package com.durgesh.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student 
{
	@Id
	@Column(name="usn")
	private String usn;
	
	@Column(name="name")
	private String name;
	@Column(name="address")
	private String address;
	@Column(name="dept")
	private String dept;
	
	
	public Student() {
	}
	public Student(String usn, String name, String address, String dept) {
		this.usn=usn;
		this.name = name;
		this.address = address;
		this.dept = dept;
	}
	
	public Student( String name, String address, String dept) {
		this.name = name;
		this.address = address;
		this.dept = dept;
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", address=" + address + ", dept=" + dept + "]";
	}
	
	

}
