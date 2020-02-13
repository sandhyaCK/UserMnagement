package com.bridgeLabz.loginRegisrtation.service;

import com.bridgeLabz.loginRegisrtation.controller.Registration;
import com.bridgeLabz.loginRegisrtation.implementation.Login;

public interface LoginService {

	public String checkLogin(Login user) throws SQLException, ClassNotFoundException;

	public String register(Registration register) throws SQLException, ClassNotFoundException;

}
