package jdbc;

import java.sql.*;

public class ex1 {

	public static void main(String[] args) throws SQLException {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from customer");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getInt(4));
			con.close();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

}
