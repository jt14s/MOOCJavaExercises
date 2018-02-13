package exercise18.moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {

	private List<Thing> things;
	private int currentCapacity;
	private final int MAX_CAPACITY;
	
	public Box(int maximumCapacity) {
		things = new ArrayList<>();
		MAX_CAPACITY = maximumCapacity;
		currentCapacity = 0;
	}
	
	public boolean addThing(Thing thing) {
		if (currentCapacity + thing.getVolume() <= MAX_CAPACITY) {
			things.add(thing);
			return true;
		}
		
		return false;
	}
	
	@Override
	public int getVolume() {
		int totalVolume = 0;
		
		for (Thing thing : things)
			totalVolume += thing.getVolume();
		
		return totalVolume;
	}
}
