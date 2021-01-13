package com.qa.main;

public class Parrot extends Animal implements Flyable{
	
	protected int numberOfLegs = 2;
	protected int LifeSpan = 60;
	protected String size = "small";
	
	public boolean canImitateSpeech() {
		return true;
	}

	@Override
	public String name() {
		return "Parrot";
		
	}

	@Override
	public String noise() {
		return "CAH CAAAH!!";
		
	}

	@Override
	public void fly() {
		System.out.println("I can fly");
		
	}

	

}
