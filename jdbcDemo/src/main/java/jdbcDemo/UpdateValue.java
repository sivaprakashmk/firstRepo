package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateValue {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/qspiders","root","root");
		Statement st=con.createStatement();
		st.executeUpdate("update students set phone_number=9999 where id=2");
		System.out.println("updated");

	}

}
