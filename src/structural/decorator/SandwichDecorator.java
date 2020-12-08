package structural.decorator;

public abstract class SandwichDecorator implements Sandwich {
	public Sandwich customSandwich;
	
	public SandwichDecorator(Sandwich customSandwich) {
		this.customSandwich = customSandwich;
	}
	
	public String make() {
		return customSandwich.make();
	}
}
