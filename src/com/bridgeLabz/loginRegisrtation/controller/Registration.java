package com.bridgeLabz.loginRegisrtation.controller;

public class Registration {
	@WebServlet("/Registration")
	public class Registration extends HttpServlet {
		private static final long serialVersionUID = 1L;

		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDataBase", "sandhya",
						"Sandhya@1234");
				System.out.println("&&&&&&&&&&&");
				System.out.println("&&&&&&&&&&&");
				String FirstName =request.getParameter("FirstName");
				String LastName = request.getParameter("LastName");
				String Email =    request.getParameter("Email");
				String UserName = request.getParameter("Name");
				String Password = request.getParameter("pwd");
				String ReEnter_Password = request.getParameter("pwd");
				String Gender = request.getParameter("Male");
				String Mobile_NO = request.getParameter("Number");
				PreparedStatement st = con.prepareStatement("insert into LoginReg values(?,?,?,?,?,?,?,?)");

				// String DateOfBirth = request.getParameter("Date");
				st.setString(1, FirstName);
				st.setString(2, LastName);
				st.setString(3, Email);
				st.setString(4, UserName);
				st.setString(5, Password);
				st.setString(6, ReEnter_Password);
				st.setString(7, Gender);
				st.setString(8, Mobile_NO);
				// st.setString(9,DateOfBirth );
				st.executeUpdate();
				PrintWriter out = response.getWriter();
				response.sendRedirect("Reg.html");
				// con.close();
				st.close();

			}

			catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
}
