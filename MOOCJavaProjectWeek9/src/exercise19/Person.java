package exercise19;

class Person {

	public Person(String name, int age) {
		if (name.isEmpty() || name.length() > 40)
			throw new IllegalArgumentException();
		
		if (age < 0 || age > 120)
			throw new IllegalArgumentException();
	}
}
