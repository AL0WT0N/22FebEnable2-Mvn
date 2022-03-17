package com.qa.solid.liskov;

public class Owl extends Bird {
	
	@Override
	public void fly() {
		System.out.println("I'm flying!!");
	}
}
