package com.qa.main;

public abstract class Animal implements Flyable, Swimmable{
	
	protected int numberOfLegs;
	
	protected int lifeSpan;
	
	protected String size;
	
	public abstract String name();
	
	public abstract String noise();
	
}
