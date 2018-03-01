package exercise45.personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

	private List<Person> people;
	
	public Employees() {
		people = new ArrayList<>();
	}
	
	public void add(Person person) {
		people.add(person);
	}
	
	public void add(List<Person> persons) {
		people.addAll(persons);
	}
	
	public void print() {
		Iterator<Person> personIterator = people.iterator();

		while (personIterator.hasNext()) {
			System.out.println(personIterator.next());
		}
	}
	
	public void print(Education education) {
		Iterator<Person> personIterator = people.iterator();

		while (personIterator.hasNext()) {
			if (personIterator.next().getEducation() == education)
				System.out.println(personIterator.next());
		}
			
	}
	
	public void fire(Education education) {
		Iterator<Person> personIterator = people.iterator();
		
		while (personIterator.hasNext()) {
			if (personIterator.next().getEducation() == education)
				personIterator.remove();
		}
	}
}
