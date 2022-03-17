package com.qa.solid.openclosed;

public class Runner {

	public static void main(String[] args) {
		Circle c = new Circle(15);
		AreaCalculator ac = new AreaCalculator();
		System.out.println(ac.calculateArea(c));
	}
}
