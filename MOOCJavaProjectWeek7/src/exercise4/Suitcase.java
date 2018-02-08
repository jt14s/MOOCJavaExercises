package exercise4;

import java.util.ArrayList;
import java.util.List;

class Suitcase {
	
	private List<Thing> things;
	private final int MAXIMUM_WEIGHT;
	private int currentWeight;
	
	public Suitcase(int maxWeight) {
		things = new ArrayList<>();
		MAXIMUM_WEIGHT = maxWeight;
		currentWeight = 0;
	}
	
	public void addThing(Thing thing) {
		if (currentWeight + thing.getWeight() <= MAXIMUM_WEIGHT) {
			things.add(thing);
			currentWeight += thing.getWeight();
		}
	}
	
	public void printThings() {
		for (Thing thing : things)
			System.out.println(thing);
	}
	
	public int totalWeight() {
		int totalWeight = 0;
		for (Thing thing : things)
			totalWeight += thing.getWeight();
		return totalWeight;
	}
	
	public Thing heaviestThing() {
		if (things.isEmpty())
			return null;
		
		int heaviestIndex = 0;
		for (int i = 1; i < things.size(); ++i)
			if (things.get(i).getWeight() > things.get(heaviestIndex).getWeight())
				heaviestIndex = i;
		return things.get(heaviestIndex);
	}
	
	@Override
	public String toString() {
		if (things.size() == 0)
			return new StringBuilder("empty (" + currentWeight + " kg)").toString();
		else if (things.size() == 1)
			return new StringBuilder(things.size() + " thing (" + currentWeight + " kg)").toString();
		else
			return new StringBuilder(things.size() + " things (" + currentWeight + " kg)").toString();
	}
}
