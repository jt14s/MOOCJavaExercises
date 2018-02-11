package exercise11;

import java.util.ArrayList;
import java.util.List;

class Box implements ToBeStored {

	private List<ToBeStored> items;
	private final double MAX_WEIGHT;
	
	public Box(double maxWeight) {
		items = new ArrayList<>();
		MAX_WEIGHT = maxWeight;
	}
	
	public void add(ToBeStored item) {
		if (weight() + item.weight() <= MAX_WEIGHT)
			items.add(item);
	}
	
	@Override
	public double weight() {
		double totalWeight = 0;
		for (ToBeStored item : items)
			totalWeight += item.weight();
		
		return totalWeight;
	}
	
	@Override
	public String toString() {
		return "Box: " + items.size() + " things, total weight " + weight() + " kg";
	}
}
