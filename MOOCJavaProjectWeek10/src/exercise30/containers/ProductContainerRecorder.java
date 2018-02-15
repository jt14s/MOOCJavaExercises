package exercise30.containers;

public class ProductContainerRecorder extends ProductContainer {

	private ContainerHistory history;

	public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
		super(productName, capacity);
		history = new ContainerHistory();
		
	}
	
	public String history() {
		return history.toString();
	}
	
	@Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        history.add(this.getVolume());
    }

    @Override
    public double takeFromTheContainer(double amount) {
        double firstVol = this.getVolume();
        super.takeFromTheContainer(amount);
        history.add(this.getVolume());
        return firstVol - this.getVolume();
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName() + "\n"
                + "History: " + this.history() + "\n"
                + "Greatest product amount: " + history.maxValue() + "\n"
                + "Smallest product amount: " + history.minValue() + "\n"
                + "Average: " + history.average() + "\n"
                + "Greatest change: " + history.greatestFluctuation() + "\n"
                + "Variance: " + history.variance());
    }
}
