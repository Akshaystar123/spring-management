package com.seleniumexpress.di;

public class Student {

	private int studentId;
	
	private String studentName;

	private Address address;

	public Student(int studentId, String studentName, Address address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address + "]";
	}

	

	/*
	 * public void setStudentId(int studentId) { this.studentId = studentId;
	 * System.out.println("setter method called: "+" :setId"); }
	 * 
	 * 
	 * 
	 * public void setStudentName(String studentName) { this.studentName =
	 * studentName; System.out.println("setter method called: "+" :setName");
	 * 
	 * }
	 */


	/*
	 * public Student(int studentId, String studentName) { super(); this.studentId =
	 * studentId; this.studentName = studentName; }
	 * 
	 * public void displayStudentInfo() {
	 * 
	 * System.out.println("Student name is :"+studentName +
	 * " and the Id is: "+studentId); }
	 */

	
	
}
