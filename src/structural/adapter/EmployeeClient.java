package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	public List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<>();
		Employee employeeFromDB = new EmployeeDB("1234","Bharati","Kulkarni","bharati@bmk.com");
		employees.add(employeeFromDB);
		return employees;
	}
}
