package com.bridgeLabz.loginRegisrtation.model;

import java.io.PrintWriter;

import javax.security.sasl.SaslException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Reg")
public class Reg {
	
		private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws SaslException, IOException {
			
			PrintWriter out=response.getWriter();
			response.sendRedirect("LoginPage.html");
			response.sendRedirect("RegistrationPage.html");
			//out.print("Reg.html");
			
			
		}

}
