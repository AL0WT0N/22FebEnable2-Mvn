package com.qa.exceptions;

public class Maths {

	public void multiply(int a, int b) throws MultiplyByFiveException {
		
		int result;
		
		if (a == 5 || b == 5) {
			throw new MultiplyByFiveException();
		}
		
		result = a * b;
		
		System.out.println(result);
		
	}
	
	public void divide(int a, int b) {
		System.err.println(a / b);
	}
	
}
