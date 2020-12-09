package structural.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCExample {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
			String dbURL = "jdbc:derby:memory:codejava/webdb;create=true";
			Connection connection = DriverManager.getConnection(dbURL);
			Statement statement = connection.createStatement();
			statement.executeUpdate("CREATE TABLE ADDRESS (ID INT, CITY VARCHAR(20))");
			System.out.println("Table Created.");
				statement.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
