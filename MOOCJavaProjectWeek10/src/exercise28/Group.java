package exercise28;

import java.util.ArrayList;
import java.util.List;

class Group implements Movable {

	private List<Movable> movables;
	
	public Group() {
		movables = new ArrayList<>();
	}
	
	public void addToGroup(Movable movable) {
		movables.add(movable);
	}
	
	@Override
	public void move(int dx, int dy) {
		for (Movable movable : movables)
			movable.move(dx, dy);
	}

	@Override
	public String toString() {
		StringBuilder groupPositions = new StringBuilder();
		
		for (Movable movable : movables)
			groupPositions.append(movable + "\n");
		
		return groupPositions.toString();
	}
}
