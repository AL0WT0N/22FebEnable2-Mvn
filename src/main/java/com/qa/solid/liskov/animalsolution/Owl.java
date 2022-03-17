package com.qa.solid.liskov.animalsolution;

public class Owl extends FlyingBird {
	
	@Override
	public void fly() {
		System.out.println("I'm flying!!");
	}
	
}
