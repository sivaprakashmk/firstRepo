package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Creating_Table {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qspiders","root","root");
		Statement st=con.createStatement();
		st.executeUpdate("create table students(id integer,name varchar(20),phone_number long, email_id varchar(20))");
		System.out.println("table created");
	}

}
