package jdbc_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Establish_connection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");    //1
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");   //2
		Statement st = con.createStatement();
		st.executeUpdate("create database company");
		System.out.println("database created");
	}
}
