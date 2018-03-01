package exercise46.reference.domain;

public class Film {

	private String name;
	
	public Film(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (name == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Film other = (Film) obj;
		if (!name.equals(other.name))
			return false;
		
		return true;
	}

	@Override
	public int hashCode() {
		if (name == null)
			return 11;
		
		return name.hashCode();
	}

	@Override
	public String toString() {
		return name;
	}
}
