package com.qa.main;

public class Human extends Animal implements Swimmable{
	
	protected int numberOfLegs =2;
	protected int LifeSpan = 80;
	protected String size = "medium";
	
	public boolean canBuildCivilisations() {
		return true;
	}
	
	@Override
	public String name() {
		return "Human";
		
	}

	@Override
	public String noise() {
		return "Hello there!";
		
	}


	@Override
	public void swim() {
		System.out.println("I can swim");
		
	}

}
