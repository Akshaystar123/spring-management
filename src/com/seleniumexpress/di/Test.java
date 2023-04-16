package com.seleniumexpress.di;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/seleniumexpress/di/beans.xml");
	    Shop bean = context.getBean("shop",Shop.class);
	    
	   System.out.println(bean);
	   
	   System.out.println("******List********");
	   List<String> books = bean.getBooks();

	   System.out.println("Using iterator");
	   Iterator<String> iterator = books.iterator();
	   
while(iterator.hasNext()) {
	String next = iterator.next();
	System.out.println(next);
}
	   
	   System.out.println("Using for loop");
	   for(String b:books) {
		   System.out.println(b);
	   }
	   
	   
		  System.out.println("******Set********");
		  
		  Set<String> mobiles = bean.getMobiles();
		  
		   System.out.println("Using iterator");
		   Iterator<String> iterator2 = mobiles.iterator();
		   while(iterator2.hasNext()) {
			   String next = iterator2.next();   
			   System.out.println(next);
		   }

		  System.out.println("Using for loop");
		  
		  for(String m :mobiles) {;
			  System.out.println(m);
		  }
		 
		  System.out.println("*****Map********");
		  
		  Map<String, String> pens = bean.getPens();
		  
		  Set<String> keySet = pens.keySet();
		  
		   System.out.println("Using iterator");

		   Iterator<String> iterator3 = keySet.iterator();
		   while(iterator3.hasNext()) {
			   String next = iterator3.next();   
			   System.out.println(next);
		   }
		   
		  System.out.println("Using for loop"); 
		  for(String s:keySet) {
		  System.out.println(s+"  "+pens.get(s)); }
		 
	}	
}
