package structural.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import creational.singleton.DbSingleton;

public class JdbcFacade {
	DbSingleton instance = null;
	public int createTable(String sta) {
		int count = 0;
		try {
			Connection connection = instance.getConnection();
			Statement statement = connection.createStatement();
			count = statement.executeUpdate(sta);
			statement.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	public JdbcFacade() {
		this.instance = DbSingleton.getInstance();
	}
	public int insertIntoTable(String sta) {
		int count = 0;
		try {
			Connection connection = instance.getConnection();
			Statement statement = connection.createStatement();
			count = statement.executeUpdate(sta);
			statement.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	public List<Address> getAddresses(String sta) {
		List<Address> addresses = new ArrayList<>();
		
		try {
			Connection connection = instance.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sta);
			while(resultSet.next()) {
				System.out.println(resultSet.getString(1)+" "+resultSet.getString(2));
				Address address = new Address();
				address.setId(resultSet.getString(1));
				address.setCity(resultSet.getString(2));
				addresses.add(address);
			}
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return addresses;
	}
}


class Address {
	private String id;
	private String city;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}