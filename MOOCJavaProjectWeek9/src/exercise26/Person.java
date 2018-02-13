package exercise26;

import java.util.HashSet;
import java.util.Set;

class Person {

	private String name;
	private Set<String> addresses;
	private Set<String> numbers;
	
	public Person(String name) {
		addresses = new HashSet<>();
		numbers = new HashSet<>();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addNumber(String number) {
		numbers.add(number);
	}
	
	public Set<String> getNumbers() {
		return numbers;
	}
	
	public void addAddress(String address) {
		addresses.add(address);
	}
	
	public Set<String> getAddresses() {
		return addresses;
	}
	
	public boolean matchesName(String pattern) {
		return name.toLowerCase().contains(pattern.toLowerCase());
	}
	
	public boolean matchesAddress(String pattern) {
		for (String address : addresses)
			if (address.toLowerCase().contains(pattern.toLowerCase()))
				return true;
		
		return false;
	}
	
	public boolean matchesNumber(String pattern) {
		for (String number : numbers)
			if (number.toLowerCase().contains(pattern.toLowerCase()))
				return true;
		
		return false;
	}
}
