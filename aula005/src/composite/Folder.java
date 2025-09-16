package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Component {
	private List<Component> children = new ArrayList<>();

	public void add(Component c) {
		children.add(c);
	}

	@Override
	public void showDetails() {
		for (Component c : children) {
			c.showDetails();
		}
	}

}
