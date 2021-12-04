package com.durgesh;

import java.io.Serializable;

public class Marks implements Serializable 
{
	private static final long serialVersionUID = 4058735100816010657L;
	private int m1;
	private int m2;
	private int m3;
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	@Override
	public String toString() {
		return " [Java=" + m1 + ", Python=" + m2 + ", C++=" + m3 + "]";
	}
	
	

}
