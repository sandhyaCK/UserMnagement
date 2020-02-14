package com.bridgeLabz.loginRegisrtation.repository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.ResultSet;

import com.bridgeLabz.loginRegisrtation.exception.UserException;
import com.mysql.cj.xdevapi.Statement;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;

public class LoginRegRepository {
	
	 @WebServlet("/LoginPage"
	 public class LoginPage extends HttpServlet {
	 	private static final long serialVersionUID = 1L;

	 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 			Class.forName("com.mysql.cj.jdbc.Driver");
	 			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDataBase","sandhya","Sandhya@1234");
	 			System.out.println("&&&&&&&&&&&");
	 			/*String FirstName = request.getParameter("FirstName");
	 			String LastName = request.getParameter("LastName");
	 			String Email = request.getParameter("Email");
	 			String UserName = request.getParameter("Name");
	 			String PassWord = request.getParameter("pwd");
	 			String ReEnter_PassWord  = request.getParameter("pwd");
	 			String Gender= request.getParameter("Male");
	 			String Mobile_No= request.getParameter("Number");*/
	 		PreparedStatement st = con.prepareStatement("select * from LoginReg WHERE UserName=?");
	 		String UserName = request.getParameter("Name");
			//String Password = request.getParameter("password");
			st.setString(1,UserName);
			//st.setString(2,Password );
	
		ResultSet rs = st.executeQuery();
	 		}
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDataBase", "sandhya",
						"Sandhya@1234");
			
			catch(Exception e)
			throw new UserException("User already exist");}
	 }
	 }
	 
