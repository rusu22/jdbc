package jdbc;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class ex3 {
	public static void main(String[] args) throws SQLException{
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","");
			String query="INSERT INTO image(Name,image)VALUES(?,?)";
			PreparedStatement pt=con.prepareStatement(query);
			pt.setString(1, "wt_image");
			FileInputStream fin=new FileInputStream("C:\\Users\\rusvi\\Pictures\\wt.png");
			pt.setBinaryStream(2,fin);
			pt.execute();
			System.out.println("record inserted..");
		}
		catch(ClassNotFoundException e)
		{
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
