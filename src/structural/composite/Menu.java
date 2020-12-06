package structural.composite;

import java.util.Iterator;

public class Menu extends MenuComponent {

	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		builder.append(print(this));
		while(iterator.hasNext()) {
			builder.append(iterator.next().toString());
		}
		
		return builder.toString();
	}
	
	public MenuComponent add(MenuComponent component) {
		menuComponents.add(component);
		return component;
	}
	
	public MenuComponent remove(MenuComponent component) {
		menuComponents.remove(component);
		return component;
	}

}
