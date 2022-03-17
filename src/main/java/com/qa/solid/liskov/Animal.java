package com.qa.solid.liskov;

public class Animal {

	public void learnToFly(Bird bird) throws Exception {
		
		if (bird instanceof Owl) {
			bird.fly();
		}
	}
}
