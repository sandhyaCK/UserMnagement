package com.bridgeLabz.loginRegisrtation.service;

import java.sql.SQLException;

import com.bridgeLabz.loginRegisrtation.controller.Registration;
import com.bridgeLabz.loginRegisrtation.implementation.Login;

public interface LoginService {

	public String Login(Login user) throws SQLException, ClassNotFoundException;

	public String register(Registration register) throws SQLException, ClassNotFoundException;

}
