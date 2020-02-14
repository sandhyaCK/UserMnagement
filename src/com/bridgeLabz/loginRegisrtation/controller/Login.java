package com.bridgeLabz.loginRegisrtation.controller;

import com.BridgeLabz.LoginRegisrtation.Implementation.Connection;
import com.BridgeLabz.LoginRegisrtation.Implementation.DataBaseConfigure;
import com.BridgeLabz.LoginRegisrtation.Implementation.LoginModel;
import com.BridgeLabz.LoginRegisrtation.Implementation.LoginService;
import com.BridgeLabz.LoginRegisrtation.Implementation.PreparedStatement;
import com.BridgeLabz.LoginRegisrtation.Implementation.ResultSet;
import com.BridgeLabz.LoginRegisrtation.Implementation.SQLException;

public class Login {
	public class LoginImplementation implements LoginService {
		ResultSet rs = null;
		Connection con = null;
		PreparedStatement st = null;
		String status = "";

		public String checkLogin(LoginModel user) throws SQLException, ClassNotFoundException {
			String s = "select * from Register";
			DataBaseConfigure db = new DataBaseConfigure();
			st = db.DataBaseConfigure().prepareStatement(s);


			rs = st.executeQuery();
			while (rs.next()) {
				if ((user.getUname().equals(rs.getString(9))) && (user.getPassword().equals(rs.getString(10)))) {
					status = "success";
				} else {
					status = "failure";
				}
			}
			return status;
		}

		
}
