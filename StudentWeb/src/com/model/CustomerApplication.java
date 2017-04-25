package com.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.Customer;
import com.database.DatabaseConnection;
import com.script.DatabaseScript;

public class CustomerApplication {

	DatabaseConnection databaseConnection;

	public void insertCustomerDetails(Customer customer) throws SQLException,
			ClassNotFoundException {

		databaseConnection = new DatabaseConnection();
		PreparedStatement preparedStatement = null;
		
		System.out.println(customer.getMobile());
		System.out.println(customer.getName());
		System.out.println(customer.getEmailid());
		System.out.println(customer.getAddress());
		
		preparedStatement = databaseConnection.getDBConnection()
				.prepareStatement(DatabaseScript.insertCustomerDetails);
		preparedStatement.setString(1, customer.getName());
		preparedStatement.setString(2, customer.getMobile()+"");
		preparedStatement.setString(3, customer.getEmailid());
		preparedStatement.setString(4, customer.getAddress());

		// execute select SQL statement
		preparedStatement.executeUpdate();

		if (preparedStatement != null) {
			preparedStatement.close();
		}

		if (databaseConnection != null) {
			databaseConnection.closeConnection();
		}

	}

}
