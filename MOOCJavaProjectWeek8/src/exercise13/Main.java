package exercise13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("James", 20000));
		people.add(new Person("Katie", 60000));
		people.add(new Person("Jorge", 80000));
		people.add(new Person("John", 10000));
		
		System.out.println("People");
		for (Person person : people)
			System.out.println(person);
		
		System.out.println("");
		Collections.sort(people);
		
		for (Person person : people)
			System.out.println(person);
	}
}
