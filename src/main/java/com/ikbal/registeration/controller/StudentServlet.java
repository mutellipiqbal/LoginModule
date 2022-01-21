package com.ikbal.registeration.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ikbal.registeration.dao.StudentDao;
import com.ikbal.registeration.model.Student;


@WebServlet("/register")
public class StudentServlet extends HttpServlet {



	public StudentServlet() {
        super();
    }
    
    StudentDao studentDao= new StudentDao();


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("registerAndLogin1.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		
		Student student= new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setUserName(userName);
		student.setPassword(password);
		student.setEmail(email);
		student.setAddress(address);
		
		try {
			studentDao.registerStudent(student);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("registerCompletion.jsp");


		
		
	}

}
