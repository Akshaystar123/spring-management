package com.Bikkadit.dependancyWithAutowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/Bikkadit/dependancyWithAutowiring/beans.xml");	
		Employee bean = context.getBean("emp",Employee.class);
		System.out.println(bean);
	}
}
		
