package com.qa.exceptions.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionWExceptions {

	Scanner scanner = new Scanner(System.in);	
	
	public void divide() {
		try {
			
			int numberOne = scanner.nextInt();
			int numberTwo = scanner.nextInt();
			
			if (numberTwo > numberOne) {
				throw new DivisionException();
			}
			
			System.out.println(numberOne / numberTwo);
		} catch (InputMismatchException inputMisEx) {
			System.out.println("ERROR: Input must be a number");
		} catch (ArithmeticException arithEx) {
			System.out.println(arithEx.getMessage());
		} catch (DivisionException divEx) {
			divEx.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}
