package structural.facade;

public class FacadePSVM {
	public static void main(String[] args) {
		JdbcFacade facade = new JdbcFacade();
		facade.createTable("CREATE TABLE ADDRESS (ID INT, CITY VARCHAR(20))");
		System.out.println("Table Created.");
		facade.insertIntoTable("INSERT INTO ADDRESS values (1,'AHMEDNAGAR')");
		System.out.println("Record inserted.");
		facade.getAddresses("SELECT * FROM ADDRESS");
	}
}
