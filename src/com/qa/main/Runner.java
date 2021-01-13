package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Animal parrot1 = new Parrot();
		
		Animal whale1 = new Whale();
		
		//Runners for Parrot
		System.out.println(parrot1.noise());
		parrot1.fly();
		parrot1.swim();
		
		//Runners for Whale
		
		System.out.println(whale1.name());
		whale1.fly();
		whale1.swim();
		System.out.println(whale1.noise());
		

	}

}
