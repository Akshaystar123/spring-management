package com.Bikkadit.dependancyWithAutowiring;

public class Employee {

	private int Empid;
	
	private String Empname;
	
	private  Address address;

	

	public int getEmpid() {
		return Empid;
	}



	public void setEmpid(int empid) {
		Empid = empid;
	}



	public String getEmpname() {
		return Empname;
	}



	public void setEmpname(String empname) {
		Empname = empname;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", Empname=" + Empname + ", address=" + address + "]";
	}

}

