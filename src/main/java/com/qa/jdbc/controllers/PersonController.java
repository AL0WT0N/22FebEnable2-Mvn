package com.qa.jdbc.controllers;

import java.util.Scanner;

import com.qa.jdbc.daos.PersonDAO;
import com.qa.jdbc.domain.Person;

public class PersonController {

	private Scanner scanner = new Scanner(System.in);
	private PersonDAO personDAO;
	
	public PersonController(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}
		
	public void create() {
		System.out.println("Please enter a first name");
		String firstName = scanner.nextLine();
		
		System.out.println("Please enter a last name");
		String lastName = scanner.nextLine();
		
		System.out.println("Please enter an age");
		int age = scanner.nextInt();
		
		personDAO.create(new Person(firstName, lastName, age));
		
		System.out.println("Customer created");
	}
	
	public void readAll() {}
	
	public void readByID() {}
	
	public void update() {}
	
	public void delete() {}
	
	
}
