package com.qa.main;

public class Whale extends Animal implements Swimmable {
	
	protected int numberOfLegs = 0;
	protected int LifeSpan = 80;
	protected String size = "Huge";
	
	public boolean isVeryMajestic() {
		return true;
	}
	
	@Override
	public String name() {
		
		return "Whale";
	}
	@Override
	public String noise() {
		
		return "Whistles" ;
	}


	@Override
	public void swim() {
		System.out.println("I can swim.");
		
	}

}
