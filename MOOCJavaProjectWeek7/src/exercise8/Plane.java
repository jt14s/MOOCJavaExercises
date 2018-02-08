package exercise8;

// This class stores plane information
class Plane {

	private String id;
	private int capacity;
	
	public Plane(String id, int capacity) {
		this.id = id;
		this.capacity = capacity;
	}
	
	@Override
	public String toString() {
		return new StringBuilder(id + " (" + capacity + " ppl)").toString();
	}
}
