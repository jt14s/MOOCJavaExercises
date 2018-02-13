package exercise20.application;

public class ConstantSensor implements Sensor {

	private int storedNumber;
	
	public ConstantSensor(int number) {
		storedNumber = number;
	}
	
	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void on() {
		
	}

	@Override
	public void off() {
		
	}

	@Override
	public int measure() {
		return storedNumber;
	}
	
}
