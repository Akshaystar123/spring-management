package com.seleniumexpress.di;

public class Address {

	private String homename;
	
	private int homeid;

	public Address(String homename, int homeid) {
		super();
		this.homename = homename;
		this.homeid = homeid;
	}

	@Override
	public String toString() {
		return "Address [homename=" + homename + ", homeid=" + homeid + "]";
	}

}
