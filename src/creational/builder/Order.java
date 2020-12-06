package creational.builder;

public class Order {
	public static class Builder {
		private String param1,param2,param3,param4;
		
		public Builder() {}
		
		public Order build() {
			return new Order(this);
		}
		
		public Builder param1(String param1) {
			this.param1 = param1;
			return this;
		}
		
		public Builder param2(String param2) {
			this.param2 = param2;
			return this;
		}
		public Builder param3(String param3) {
			this.param3 = param3;
			return this;
		}
		public Builder param4(String param4) {
			this.param4 = param4;
			return this;
		}
	}
	
	private String param1,param2,param3,param4;
	
	private Order(Builder builder) {
		this.param1 = builder.param1;
		this.param2 = builder.param2;
		this.param3 = builder.param3;
		this.param4 = builder.param4;
	}
	
	public String getParam1() {
		return param1;
	}
	public String getParam2() {
		return param2;
	}
	public String getParam3() {
		return param3;
	}
	public String getParam4() {
		return param4;
	}
}
