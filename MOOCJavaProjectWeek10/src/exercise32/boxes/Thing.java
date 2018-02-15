package exercise32.boxes;

public class Thing {

	private String name;
	private int weight;
	
	public Thing(String name) {
		this(name, 0);
	}
	
	public Thing(String name, int weight) {
		this.name = name;
		if (weight >= 0)
			this.weight = weight;
		else
			throw new IllegalArgumentException();
	}

	public int getWeight() {
		return weight;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Thing otherThing = (Thing) obj;
		return name.equals(otherThing.name);
	}

	@Override
	public int hashCode() {
		if (name == null)
			return 7;
		
		return name.hashCode();
	}
	
	
}
