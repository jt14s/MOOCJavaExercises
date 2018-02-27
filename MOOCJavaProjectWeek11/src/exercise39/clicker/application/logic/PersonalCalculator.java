package exercise39.clicker.application.logic;

public class PersonalCalculator implements Calculator {

	private int value;
	
	public PersonalCalculator() {
		value = 0;
	}
	
	@Override
	public int giveValue() {
		return value;
	}
	
	@Override
	public void increase() {
		value++;
	}
}
