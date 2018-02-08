package exercise4;

import java.util.ArrayList;
import java.util.List;

class Container {
	
	private final int MAXIMUM_WEIGHT;
	private int currentWeight;
	private List<Suitcase> cases;
	
	public Container(int weight) {
		cases = new ArrayList<>();
		MAXIMUM_WEIGHT = weight;
		currentWeight = 0;
	}
	
	public void addSuitcase(Suitcase suitcase) {
		if (currentWeight + suitcase.totalWeight() <= MAXIMUM_WEIGHT) {
			cases.add(suitcase);
			currentWeight += suitcase.totalWeight();
		}
	}
	
	public void printThings() {
		for (Suitcase suitcase : cases)
			suitcase.printThings();
	}
	
	@Override
	public String toString() {
		if (cases.size() == 0)
			return new StringBuilder("empty (0 kg)").toString();
		else if (cases.size() == 1)
			return new StringBuilder("1 suitcase (" + currentWeight + " kg)").toString();
		else
			return new StringBuilder(cases.size() + " suitcase (" + currentWeight + " kg)").toString();
	}
}
