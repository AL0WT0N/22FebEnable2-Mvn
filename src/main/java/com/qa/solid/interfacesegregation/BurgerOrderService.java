package com.qa.solid.interfacesegregation;

public class BurgerOrderService implements OrderService {
	
	@Override
	public void orderBurger(int quantity) {
		System.out.println("Received order of " + quantity + " burgers");
	}

	@Override
	public void orderFries(int fries) {
		throw new UnsupportedOperationException("No fries in burger only order");
	}

	@Override
	public void orderMeal(int quantity, int fries) {
		throw new UnsupportedOperationException("No combo in burger only order");
	}
}