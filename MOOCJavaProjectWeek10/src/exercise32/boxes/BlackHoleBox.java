package exercise32.boxes;

import java.util.ArrayList;
import java.util.List;

public class BlackHoleBox extends Box {

	List<Thing> things;
	
	public BlackHoleBox() {
		things = new ArrayList<>();
	}
	
	@Override
	public void add(Thing thing) {
		things.add(thing);
	}

	@Override
	public boolean isInTheBox(Thing thing) {
		return false;
	}

	
}
