package creational.singleton;

import java.sql.Connection;
import java.sql.Statement;

public class DbSingletonDemo {

	public static void main(String[] args) {
		DbSingleton dbSingleton = DbSingleton.getInstance();
		Connection connection = dbSingleton.getConnection();
		Statement statement;
		try {
			statement  = connection.createStatement();
			statement.executeUpdate("CREATE TABLE ADDRESS (ID INT, CITY VARCHAR(20))");
			System.out.println("Table Created.");
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
