package com.seleniumexpress.di;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) throws Exception{
		
		/*
		 * Student student=new Student(); student.setStudentName("Akshay Khaire");
		 * student.displayStudentInfo();
		 */
		
	ApplicationContext context=new ClassPathXmlApplicationContext("com/seleniumexpress/di/beans.xml");	
	Student bean = context.getBean("student", Student.class);
	System.out.println(bean);
	/*
	 * bean.displayStudentInfo();
	 */	/*
	Student bean2 = context.getBean("akshay" ,Student.class);
	bean2.displayStudentInfo();
 }*/
	
	/*
	 * Student student=new Student(101, "Akshay"); student.displayStudentInfo();
	 */
	
}
}
