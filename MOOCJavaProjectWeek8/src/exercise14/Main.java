package exercise14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();	
		students.add(new Student("Jorge"));
		students.add(new Student("Katie"));
		students.add(new Student("Alex"));
		students.add(new Student("Ben"));
	
		System.out.println("Students");
		for (Student student : students)
			System.out.println(student);
		
		System.out.println("");
		Collections.sort(students);
		
		for (Student student : students)
			System.out.println(student);
	}
}
