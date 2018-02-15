package exercise30.containers;

public class Container {

	private double volume;
	private double capacity;
	
	public Container(double capacity) {
		if (capacity > 0.0)
			this.capacity = capacity;
		else
			this.capacity = 0.0;
		volume = 0.0;
	}
	
	public double getVolume() {
		return volume;
	}
	
	public double getOriginalCapacity() {
		return capacity;
	}
	
	public double getCurrentCapacity() {
		return capacity - volume;
	}
	
	public void addToTheContainer(double amount) {
		if (amount < 0)
			return;
		
		if (amount <= getCurrentCapacity()) {
			volume += amount;
		} else {
			volume = capacity;
		}
	}

	public double takeFromTheContainer(double amount) {
		if (amount < 0)
			return 0.0;
		
		if (amount > volume) {
			double returnAmount = volume;
			volume = 0.0;
			return returnAmount;
		} else {
			volume -= amount;
			return amount;
		}
	}

	@Override
	public String toString() {
		return "volume = " + volume + ", free space " + getCurrentCapacity();
	}
}
