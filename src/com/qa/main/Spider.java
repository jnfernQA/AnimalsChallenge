package com.qa.main;

public class Spider extends Animal {
	
	protected int numberOfLegs = 6;
	protected int LifeSpan = 1;
	protected String size = "tiny";
	
	
	protected boolean isCreepy() {
		return true;
	}
	
	
	@Override
	public String name() {
		return "Spider";
		
	}

	@Override
	public String noise() {
		return null;
		
	}


	@Override
	public void fly() {
		System.out.println("I cannot fly");
		
	}


	@Override
	public void swim() {
		System.out.println("I cannot swim");
		
	}

}
