package exercise26;

import java.util.HashMap;
import java.util.Map;

class Directory {

	private Map<String, Person> people;
	
	public Directory() {
		people = new HashMap<>();
	}
	
	//#1
	public void addNumber(String name, String number) {
		if (people.containsKey(name))
			people.get(name).addNumber(number);
		else {
			Person person = new Person(name);
			person.addNumber(number);
			people.put(name, person);
		}
	}
	
	//#2
	public void searchNumber(String name) {
		if (people.containsKey(name)) {
			for (String number : people.get(name).getNumbers())
				System.out.println("  " + number);
		} else
			System.out.println("  not found");
	}
	
	//#3
	public void searchName(String number) {
		boolean found = false;
		
		for (Person person : people.values()) {
			if (person.getNumbers().contains(number)) {
				System.out.println("  " + person.getName());
				found = true;
			}
		}
		
		if (!found)
			System.out.println(" not found");
	}
	
	//#4
	public void addAddress(String name, String address) {
		if (people.containsKey(name)) {
			people.get(name).addAddress(address);
		} else {
			Person person = new Person(name);
			person.addAddress(address);
			people.put(name, person);
		}
	}
	
	//#5
	public void searchPersonInfo(String name) {
		if (people.containsKey(name)) {
			System.out.println("  addresses:");
			for (String address : people.get(name).getAddresses())
				System.out.println("     " + address);
			System.out.println("  phone numbers:");
			for (String number : people.get(name).getNumbers())
				System.out.println("     " + number);
		} else {
			System.out.println("  not found");
		}
	}
	
	//#6
	public void removeInformation(String name) {
		if (people.containsKey(name)) {
			people.remove(name);
		} else {
			System.out.println("  not found");
		}
	}
	
	//#7
	public void searchByFilter(String pattern) {
		boolean found = false;
		
		for (Person person : people.values())
			if (person.matchesName(pattern))
				printPersonalInformation(person, found);
		
		if (!found) {
			for (Person person : people.values())
				if (person.matchesAddress(pattern))
					printPersonalInformation(person, found);
		} else
			return;
		
		if (!found) {
			for (Person person : people.values())
				if (person.matchesNumber(pattern))
					printPersonalInformation(person, found);
		} else
			return;
		
		if (!found) {
			for (Person person : people.values())
				printPersonalInformation(person, found);
		}	
	}

	private void printPersonalInformation(Person person, boolean found) {
		found = true;
		
		System.out.println("  name: " + person.getName());
		for (String address : person.getAddresses())
			System.out.println("     " + address);
		System.out.println("  phone numbers:");
		for (String number : person.getNumbers())
			System.out.println("     " + number);
	}
}
