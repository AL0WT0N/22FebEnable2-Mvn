package com.qa.jdbc.controllers;

import java.util.List;

public interface CrudController<T> {

	void create();
	
	List<T> readAll();
	
	T readByID();
	
	T update();
	
	int delete();
	
}
