package structural.adapter;

public class EmployeeLDAP {
	private int id;
	private String firstName;
	private String lastName;
	private String mail;
	public EmployeeLDAP(int id, String firstName, String lastName, String mail) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getMail() {
		return mail;
	}
}
