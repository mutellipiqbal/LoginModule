package com.ikbal.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uName");
		String password=request.getParameter("pass");

		
		PrintWriter outPrintWriter=response.getWriter();
		LoginDao loginDao=new LoginDao();
		HttpSession session;
		

			if (loginDao.check(username, password)) {
				
				
				session=request.getSession();
				session.setAttribute("username", username);
				session.setAttribute("password", password);

				response.sendRedirect("welcome.jsp");
			}else {
				response.sendRedirect("registerAndLogin1.jsp");
				outPrintWriter.println("Please check your login credential...");
			}

		
		
	}


}
