package com.qa.jdbc.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.qa.jdbc.domain.Customer;

public interface Dao<T> {

	void create(T t);
	
	T readByID(int id);
	
	List<T> readAll();
	
	void update(T t);
	
	int delete(int id);
	
	T modelFromResultSet(ResultSet resultSet) throws SQLException;
	
}
