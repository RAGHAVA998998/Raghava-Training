package testing2;

import java.sql.Connection;
import java.sql.DriverManager;

public class main_java {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getConnection();
	}
	public static Connection getConnection() throws Exception{
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url ="jdbc:mysql://localhost:3306/raghava1";
			String username= "raghava";
			String password = "raghavam";
			//Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("connection succesful");
			return conn;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return null;
		
	}

}
