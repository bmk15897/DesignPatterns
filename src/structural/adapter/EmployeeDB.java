package structural.adapter;

public class EmployeeDB implements Employee {
	private String id;
	private String fName;
	private String lName;
	private String email;
	public EmployeeDB(String id, String fName, String lName, String email) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
	}
	@Override
	public String getFName() {
		return fName;
	}
	@Override
	public String getLName() {
		return lName;
	}
	@Override
	public String getId() {
		return id;
	}
	@Override
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return "ID: "+getId()+" EMAIL: "+getEmail();
	}
}
