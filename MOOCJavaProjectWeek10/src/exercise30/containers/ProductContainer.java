package exercise30.containers;

public class ProductContainer extends Container {

	private String name;
	
	public ProductContainer(String name, double capacity) {
		super(capacity);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + ": " + super.toString();
	}
}
