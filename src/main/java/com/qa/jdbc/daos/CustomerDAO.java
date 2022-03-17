package com.qa.jdbc.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.qa.jdbc.domain.Customer;

public class CustomerDAO implements Dao<Customer> {

	@Override
	public void create(Customer t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer readByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer update(Customer t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer modelFromResultSet(ResultSet resultSet) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
