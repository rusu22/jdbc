package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ex6 {
	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
			System.out.println("connected");
			con.setAutoCommit(false);
			Statement s=con.createStatement();
			String s1="insert into employee1 (emp_id,emp_name,salary,dept)values(109,'max',15000,'ee')";
			s.executeUpdate(s1);
			String s2="insert in employee1 (emp_id,emp_name,salary,dept)values(109,'max',15000,'ee')";
			s.executeUpdate(s2);
			con.commit();
			con.rollback();
			System.out.println("exit");
			
		}
		catch(Exception e)
		{
			
		}
	}
}
