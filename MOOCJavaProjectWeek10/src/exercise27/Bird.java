package exercise27;

class Bird {

	private String name;
	private String latinName;
	private int ringingYear;
	
	public Bird(String name, String latinName, int ringingYear) {
		this.name = name;
		this.latinName = latinName;
		this.ringingYear = ringingYear;
	}

	@Override
	public String toString() {
		return this.latinName + "(" + this.ringingYear + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		if (this.getClass() != obj.getClass())
			return false;
		
		Bird otherBird = (Bird) obj;
		if (latinName == otherBird.latinName && ringingYear == otherBird.ringingYear)
			return true;
		
		return false;
	}

	@Override
	public int hashCode() {
		return latinName.hashCode() + ringingYear;
	}
	
	
}
