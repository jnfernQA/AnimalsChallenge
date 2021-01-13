package com.qa.main;

public abstract class Animal {
	
	protected int numberOfLegs;
	
	protected int lifeSpan;
	
	protected String size;
	
	public abstract String name();
	
	public abstract String noise();

	public void swim() {
	}

	public void fly() {
	}
	
}
