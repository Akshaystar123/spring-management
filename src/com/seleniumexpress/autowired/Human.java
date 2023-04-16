package com.seleniumexpress.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	public Human() {
		
	}
	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;
	
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("human consr is getting called which has Heart as arg");
	}

	public void startpumping() {
		
		if(heart!=null)
		{
			heart.pump();
			
			System.out.println("name of animal is: "+
					       "no.of hearts present: "+heart);
		}
		else {
			System.out.println("you are dead");
		}
		
	}
}
