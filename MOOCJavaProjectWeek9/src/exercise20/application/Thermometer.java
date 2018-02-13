package exercise20.application;

import java.util.concurrent.ThreadLocalRandom;

public class Thermometer implements Sensor {
	
	private boolean on;

	public Thermometer() {
		on = false;
	}
	
	@Override
	public boolean isOn() {
		return on;
	}

	@Override
	public void on() {
		on = true;
	}

	@Override
	public void off() {
		on = false;
	}

	@Override
	public int measure() {
		if (!isOn())
			throw new IllegalStateException();
		
		return ThreadLocalRandom.current().nextInt(-30, 30 + 1);
	}
}
