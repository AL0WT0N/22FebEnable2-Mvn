package com.qa.jdbc.controllers;

import java.util.List;
import java.util.Scanner;

import com.qa.jdbc.daos.PersonDAO;
import com.qa.jdbc.domain.Person;

public class PersonController implements CrudController<Person>{

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
	
	public List<Person> readAll() {
		List<Person> results = personDAO.readAll();
		
		for (Person p : results) {
			System.out.println(p);
		}
		
		return results;
	}
	
	public Person readByID() {
		System.out.println("Please enter an ID to search");
		int id = scanner.nextInt();
		
		Person result = personDAO.readByID(id);
		
		System.out.println(result);
		
		return result;
	}
	
	public Person update() {
		System.out.println("Please enter the ID of the person you'd like to update");
		int id = scanner.nextInt();
		
		System.out.println("Please enter a first name");
		String firstName = scanner.nextLine();
		
		System.out.println("Please enter a last name");
		String lastName = scanner.nextLine();
		
		System.out.println("Please enter an age");
		int age = scanner.nextInt();
		
		Person result = personDAO.update(new Person(id, firstName, lastName, age));
		
		System.out.println("Person updated");
		
		return result;
	}
	
	public int delete() {
		System.out.println("Please enter the ID of the person you'd like to delete");
		int id = scanner.nextInt();
		int result = personDAO.delete(id);
		if (result != 0) {
			System.out.println("Person with ID: " + id + " deleted");
			return result;
		} else {
			System.out.println("Person not found"); // This 'could' be an exception
			return result;
		}
	}
}
