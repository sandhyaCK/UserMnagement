package com.bridgeLabz.loginRegisrtation.implementation;

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

		public String register(LoginModel register) throws SQLException, ClassNotFoundException {

			String s1 = "select * from Register";
			DataBaseConfigure db = new DataBaseConfigure();
			st = db.DataBaseConfigure().prepareStatement(s1);

			ResultSet rs1=st.executeQuery();

			while (rs1.next()) {
				if (register.getUname().equals(rs1.getString(9)))
					status = "existed";
				break;

			}

			if (!status.equals("existed")) {

				String insertQuery = "INSERT into Register values(?,?,?,?,?,?,?,?,?,?)";
				st = db.DataBaseConfigure().prepareStatement(insertQuery);
				st.setString(1, register.getfName());
				st.setString(2, register.getfName());
				st.setString(3, register.getEmail());
				st.setString(4, register.getPhoneno());
				st.setString(5, register.getCity());
				st.setString(6, register.getState());
				st.setString(7, register.getCountry());
				st.setString(8, register.getPin());
				st.setString(9, register.getUname());
				st.setString(10, register.getPassword());

				st.executeUpdate();

				status = "success";

			}
			return status;
		}
}
