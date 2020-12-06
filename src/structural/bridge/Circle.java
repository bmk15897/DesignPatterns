/**
 * 
 */
package structural.bridge;

/**
 * @author Kulkarni
 *
 */
public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		color.applyColor();
	}

}