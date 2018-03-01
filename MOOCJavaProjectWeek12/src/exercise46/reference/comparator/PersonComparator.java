package exercise46.reference.comparator;

import java.util.Comparator;
import java.util.Map;

import exercise46.reference.domain.Person;

public class PersonComparator implements Comparator<Person> {

	private Map<Person, Integer> peopleIdentities;
	
	public PersonComparator(Map<Person, Integer> peopleIdentities) {
		this.peopleIdentities = peopleIdentities;
	}
	
	@Override
	public int compare(Person person1, Person person2) {
		return peopleIdentities.get(person2) - peopleIdentities.get(person1);
	}
}
