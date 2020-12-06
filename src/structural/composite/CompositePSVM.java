package structural.composite;

public class CompositePSVM {
	public static void main(String[] args) {
		Menu mainMenu = new Menu("Main", "/main");
		MenuItem item = new MenuItem("Safety", "/safety");
		mainMenu.add(item);
		Menu claimsSubmenu = new Menu("Claims", "/claims");
		mainMenu.add(claimsSubmenu);
		MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
		claimsSubmenu.add(personalClaimsMenu);
		System.out.println(mainMenu.toString());
	}
}
