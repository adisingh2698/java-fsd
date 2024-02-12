package dbc;
import java.sql.*;

public class Dbcconn {
	public static void main(String[] args)  {
		try
		{
			// driver loading
			Class.forName("com.mysql.cj.jdbc.Driver");
			// make connection
			Connection conObj = DriverManager.getConnection("jdbc:mysql://Localhost:3306/productinfo","root", "Adisingh8381@");
			if(conObj!=null)
				System.out.println("DB Connected...");			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}

}
