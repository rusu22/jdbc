package jdbc;
import java.sql.*;
public class ex4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
		  
		CallableStatement s=con.prepareCall("{call insertR(?,?)}");  
		s.setInt(1,1001);  
		s.setString(2,"max");  
		s.execute();  
		  
		System.out.println("success");  
	}
}
