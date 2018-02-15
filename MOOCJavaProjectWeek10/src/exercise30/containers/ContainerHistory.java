package exercise30.containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainerHistory {

	private List<Double> history;
	
	public ContainerHistory() {
		history = new ArrayList<>();
	}
	
	public void add(double situation) {
		history.add(situation);
	}
	
	public void reset() {
		history.clear();
	}
	
	public double maxValue() {
		if (history.isEmpty())
			return 0;
		return Collections.max(history);
	}
	
	public double minValue() {
		if (history.isEmpty())
			return 0;
		return Collections.min(history);
	}
	
	public double average() {
		if (history.isEmpty())
			return 0;
		return history.stream().mapToDouble(val -> val).average().getAsDouble();
	}
	
	public double greatestFluctuation() {
		if (history.isEmpty() || history.size() == 1)
			return 0;
		
		double greatestDifference = Math.abs(history.get(0));
		for (int i = 0; i < history.size() - 1; ++i) {
			for (int j = i + 1; j < history.size(); ++j) {
				if (Math.abs(history.get(i) - history.get(j)) > greatestDifference)
					greatestDifference = Math.abs(history.get(i) - history.get(j));
			}
		}
		
		return greatestDifference;
	}
	
	 public double variance() {
        double mean = average();
        double sum = 0;

        for (double state1 : history) {
            sum += Math.pow((state1 - mean), 2);
        }
        return sum / (history.size() - 1);
	 }

	@Override
	public String toString() {
		return history.toString();
	}
}
