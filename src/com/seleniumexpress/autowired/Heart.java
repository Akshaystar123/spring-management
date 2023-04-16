package com.seleniumexpress.autowired;

public class Heart {

	private String nameOfAnimal;
	
	private int noOfHeart;
	
	public String getNameOfAnimal() {
		return nameOfAnimal;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public int getNoOfHeart() {
		return noOfHeart;
	}

	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}

	@Override
	public String toString() {
		return "Heart [nameOfAnimal=" + nameOfAnimal + ", noOfHeart=" + noOfHeart + "]";
	}

	public void pump() {
		
		System.out.println("Heart is pumping");
		System.out.println("Alive");
	}
}
