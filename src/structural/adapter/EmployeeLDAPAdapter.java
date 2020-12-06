package structural.adapter;

public class EmployeeLDAPAdapter implements Employee {
	private EmployeeLDAP employeeLDAP;
	public EmployeeLDAPAdapter(EmployeeLDAP employeeLDAP) {
		this.employeeLDAP = employeeLDAP;
	}
	@Override
	public String getId() {
		return employeeLDAP.getId()+" ";
	}
	@Override
	public String getFName() {
		return employeeLDAP.getFirstName();
	}
	@Override
	public String getLName() {
		return employeeLDAP.getLastName();
	}
	@Override
	public String getEmail() {
		return employeeLDAP.getMail();
	}
	@Override
	public String toString() {
		return "ID: "+getId()+" EMAIL: "+getEmail();
	}
}
