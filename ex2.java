package jdbc;
import java.sql.*;
public class ex2 {
	public static void main(String[] args) throws SQLException {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
			System.out.println("connected");
			String insertQuery="INSERT INTO employee (emp_id,emp_name,dept,sal) Values(?,?,?,?)";
			PreparedStatement pt= con.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
			pt.setInt(1,101);
			pt.setString(2, "john");
			pt.setString(3, "CE");
			pt.setInt(4, 22000);
			pt.addBatch();
			pt.setInt(1,102);
			pt.setString(2, "max");
			pt.setString(3, "EE");
			pt.setInt(4, 52000);
			pt.addBatch();
			pt.executeBatch();
			ResultSet r=pt.getGeneratedKeys();
			System.out.println("auto incremented value of keys are");
			while(r.next()) {
				System.out.println(r.getInt(1));
			}
			
		}
		catch(ClassNotFoundException e)
		{
			
		}
	}
}
