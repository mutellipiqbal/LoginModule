package com.ikbal.registeration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import com.ikbal.registeration.model.Student;

public class StudentDao {

	public int registerStudent(Student student) throws ClassNotFoundException {
		String insertUseSQL = "insert into student "
				+ "(id,firstName,lastName,userName,password,email,address) values " + "(?,?,?,?,?,?,?);";

		int result = 0;

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/ikbal";
		String username = "root";
		String password = "admin";

		try {

			Connection connection = DriverManager.getConnection(url, username, password);
			PreparedStatement statement = connection.prepareStatement(insertUseSQL);
			statement.setString(1, null);
			statement.setString(2, student.getFirstName());
			statement.setString(3, student.getLastName());
			statement.setString(4, student.getUserName());
			statement.setString(5, student.getPassword());
			statement.setString(6, student.getEmail());
			statement.setString(7, student.getAddress());

			result= statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
