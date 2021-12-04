package com.durgesh;

public class Student 
{
	
	private String name;
	private String usn;
	private String address;
	private int fee;

	
	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", usn=" + usn + ", address=" + address + ", fee=" + fee + "]";
	}

	
	


	

}
