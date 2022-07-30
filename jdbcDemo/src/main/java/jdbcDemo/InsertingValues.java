package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qspiders","root","root");
		Statement st=con.createStatement();
		//st.executeUpdate("insert into students values(1,'siva',988,'sia@gmail.com')");
		//st.executeUpdate("insert into students values(2,'ram',987,'ram@gmail.com')");
		st.executeUpdate("insert into students values(3,'mam',927,'mam@gmail.com')");
		st.executeUpdate("insert into students values(4,'vam',937,'vam@gmail.com')");
		System.out.println("values inserted");
	}

}
