package structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
	String name;
	String url;
	List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	public String getName() {
		return name;
	}
	public List<MenuComponent> getMenuComponents() {
		return menuComponents;
	}
	public abstract String toString();
	String print(MenuComponent component) {
		StringBuilder builder = new StringBuilder(name);
		builder.append(": ");
		builder.append(url);
		builder.append("\n");
		return builder.toString();
	}
}
