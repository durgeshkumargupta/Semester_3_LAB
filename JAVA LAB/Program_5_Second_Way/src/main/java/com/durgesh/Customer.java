package com.durgesh;

import java.io.Serializable;

public class Customer implements Serializable
{
	private static final long serialVersionUID = -2937165078778702016L;
	private String pname;
	private int page;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	@Override
	public String toString() {
		return " [Passanger Name=" + pname + ", Passanger Age=" + page + "]";
	}
	

}
