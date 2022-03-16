package com.qa.exceptions;

public class Runner {

	public static void main(String[] args) {
		
		Maths maths = new Maths();
		
//		try {
//			maths.multiply(5, 20);
//		} catch (MultiplyByFiveException e) {
//			System.out.println(e.getMessage());
//		}

		maths.divide(10, 0);
		
	}

}
