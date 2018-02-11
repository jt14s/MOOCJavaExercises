package exercise14;

class Student implements Comparable<Student> {

	private String name;
	
	public Student(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student other) {
		return name.compareTo(other.name);
	}
	
	@Override
	public String toString() {
		return "Name: " + name;
	}
}
