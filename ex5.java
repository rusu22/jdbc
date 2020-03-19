package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ex5 {
	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
			Statement s=con.createStatement();
			s.addBatch("insert into employee1 (emp_id,emp_name,salary,dept)values(108,'megha',15000,'ce')");
			s.addBatch("update employee1 set salary=30000,emp_id=106  where emp_name='dhwani'");
			s.executeBatch();
			System.out.println("record inserted");
		}
		catch(Exception e)
		{
			
		}
	}
}
