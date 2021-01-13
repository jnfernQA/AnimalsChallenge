package com.qa.main;

public class Parrot extends Animal {
	
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
		return "QAH QAAAH!!";
		
	}

	@Override
	public void fly() {
		System.out.println("I can fly");
		
	}

	@Override
	public void swim() {
		System.out.println("I cannot swim");
		
	}

}
