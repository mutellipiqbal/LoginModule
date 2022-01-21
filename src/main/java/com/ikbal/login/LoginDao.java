package com.ikbal.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.annotation.WebServlet;


public class LoginDao {
	String sql="select * from student where userName=? and password=?";
	String url="jdbc:mysql://localhost:3306/ikbal";
	String username="root";
	String password="admin";
	
	public boolean check(String uname, String pass) {

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url,username,password);
			PreparedStatement statement=connection.prepareStatement(sql);
			statement.setString(1, uname);
			statement.setString(2, pass);

		
			ResultSet rSet=statement.executeQuery();
			if (rSet.next()) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
		
	}

}
