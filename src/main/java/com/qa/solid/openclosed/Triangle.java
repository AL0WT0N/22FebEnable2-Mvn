package com.qa.solid.openclosed;

public class Triangle implements Shape {

	private double base;
	private double height;
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return 0.5 * base * height;
	}

}
