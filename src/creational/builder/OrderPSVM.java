package creational.builder;

public class OrderPSVM {
	public static void main(String[] args) {
		Order.Builder builder = new Order.Builder();
		builder.param1("param1").param2("param2").param3("param3").param4("param4");
		Order order = builder.build();
		System.out.println(order.toString());
		System.out.println(order.getParam1()+" "+order.getParam2()+" "+order.getParam3()+" "+order.getParam4());
	}
}
