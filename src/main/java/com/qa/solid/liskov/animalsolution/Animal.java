package com.qa.solid.liskov.animalsolution;

public class Animal {

	public void learnToFly(FlyingBird flyBird) {
		flyBird.fly();
	}

	public void tryToFly(FlightlessBird groundBird) {
		groundBird.flap();
	}
	
}
