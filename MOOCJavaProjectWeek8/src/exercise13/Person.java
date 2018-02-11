package exercise13;

class Person implements Comparable<Person> {

	private String name;
	private int salary;
	
	public Person(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Person other) {
		return other.salary - salary;
	}
	
	@Override
	public String toString() {
		return name + ": $" + salary;
	}
}
