
package com.seleniumexpress.autowired;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) throws Exception{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/seleniumexpress/autowired/beans.xml");
		Human human = context.getBean("human", Human.class);
		human.startpumping();
		
	}
}
