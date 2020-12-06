package structural.bridge;

public class BridgeColorPSVM {

	public static void main(String[] args) {
		Color blue = new Blue();
		Shape blueSquare = new Square(blue);
		blueSquare.applyColor();
		
		Color green = new Green();
		Shape greenCircle = new Circle(green);
		greenCircle.applyColor();
	}

}
