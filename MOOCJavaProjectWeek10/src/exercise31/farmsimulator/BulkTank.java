package exercise31.farmsimulator;

public class BulkTank {

	private double capacity;
	private double volume;
	
	public BulkTank() {
		capacity = 2000.0;
		volume = 0.0;
	}
	
	public BulkTank(double capacity) {
		this.capacity = capacity;
		volume = 0.0;
	}
	
	public double getCapacity() {
		return capacity;
	}
	
	public double getVolume() {
		return volume;
	}
	
	public double howMuchFreeSpace() {
		return capacity - volume;
	}
	
	public void addToTank(double amount) {
		if (volume + amount > capacity)
			volume = capacity;
		else
			volume += amount;
	}
	
	public double getFromTank(double amount) {
		if (volume - amount < 0) {
			volume = 0;
			return amount;
		} else {
			volume -= amount;
			return amount;
		}
	}
	
	public String toString() {
		return Math.ceil(volume) + "/" + capacity;
	}
}
