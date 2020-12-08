package creational.builder;

public class StringBuilderExample {

	public static void main(String[] args) {
		String name = "ABC";
		StringBuilder builder = new StringBuilder();
		builder.append("Hello ");
		builder.append("World ");
		builder.append("From ");
		builder.append(name);
		System.out.println(builder.toString());
	}
}
