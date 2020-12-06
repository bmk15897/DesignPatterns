package structural.adapter;

import java.util.List;

public class AdapterPSVM {

	public static void main(String[] args) {
		EmployeeClient client = new EmployeeClient();
		List<Employee> employees = client.getEmployeeList();
		System.out.println(employees);
		EmployeeLDAP employeeLDAP = new EmployeeLDAP(2,"bharati", "kulkarni", "bmk@bmk.com");
		employees.add(new EmployeeLDAPAdapter(employeeLDAP));
		System.out.println(employees);
	}
}
