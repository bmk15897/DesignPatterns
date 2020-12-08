package creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbSingleton {
	public static volatile DbSingleton instance = null;
	public volatile Connection connection = null;
	private DbSingleton() {
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (connection != null) {
			throw new RuntimeException("use getConnection()");
		}
		if(instance != null) {
			throw new RuntimeException("use getInstance()");
		}
	}
	public static DbSingleton getInstance() {
		if(instance == null) {
			synchronized (DbSingleton.class) {
				if(instance==null) {
					instance = new DbSingleton();
				}
			}
		}
		return instance;
	}
	public Connection getConnection() {
		if(connection == null) {
			synchronized (DbSingleton.class) {
				if(connection==null) {
					try {
						String dbURL = "jdbc:derby:memory:codejava/webdb;create=true";
						connection = DriverManager.getConnection(dbURL);
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		return connection;
	}
}
