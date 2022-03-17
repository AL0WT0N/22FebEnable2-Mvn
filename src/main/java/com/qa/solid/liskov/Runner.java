package com.qa.solid.liskov;

public class Runner {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		Owl owl = new Owl();
		Penguin penguin = new Penguin();

		try {
			animal.learnToFly(penguin);
			animal.learnToFly(owl);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
