package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {

	
	private static String url="jdbc:mysql://localhost:3306/automart";
	private static String user="root";
	private static String password="200d80*#";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection(url,user,password);
		}catch(Exception e)
		{
			System.out.println("Database connection is not successfull!!");
		}
		return con;
		
	}
	
	
	
}
