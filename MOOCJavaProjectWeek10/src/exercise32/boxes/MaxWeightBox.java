package exercise32.boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {

	private final int MAX_WEIGHT;
	private int currentWeight;
	private List<Thing> things;
	
	public MaxWeightBox(int maxWeight) {
		things = new ArrayList<>();
		MAX_WEIGHT = maxWeight;
		currentWeight = 0;
	}
	
	@Override
	public void add(Thing thing) {
		if (currentWeight + thing.getWeight() <= MAX_WEIGHT) {
			things.add(thing);
			currentWeight += thing.getWeight();
		}
	}

	@Override
	public boolean isInTheBox(Thing thing) {
		if (things.contains(thing))
			return true;
		
		return false;
	}
}
