package com.qa.jdbc;

import java.util.List;

import com.qa.jdbc.controllers.PersonController;
import com.qa.jdbc.daos.PersonDAO;
import com.qa.jdbc.domain.Person;

public class Runner {

	public static void main(String[] args) {
		// Testing connection
//		TestConnection tc = new TestConnection();
//		tc.testConnection();

		// CRUD functionality (CREATE, READ, UPDATE, DELETE)
		// Data Access Object
		PersonDAO pDAO = new PersonDAO();
		PersonController pController = new PersonController(pDAO);
		
		// CRUD Methods
		pController.create();
//		pController.readAll();
//		pController.readByID();
//		pController.update();
//		pController.delete();
	}
}
