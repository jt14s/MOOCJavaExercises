package exercise20.application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

	private List<Sensor> sensors;
	private boolean on;
	
	public AverageSensor() {
		sensors = new ArrayList<>();
		on = false;
	}
	
	public void addSensor(Sensor sensor) {
		sensors.add(sensor);
	}
	
	public List<Integer> readings() {
		List<Integer> measurements = new ArrayList<>();
		
		for (Sensor sensor : sensors)
			measurements.add(sensor.measure());
		
		return measurements;
	}
	
	@Override
	public boolean isOn() {
		boolean state = true;
		
		for (Sensor sensor : sensors) {
			if (!sensor.isOn()) {
				state = false;
				break;
			}
		}
		on = state;
		
		return on;
	}

	@Override
	public void on() {
		for (Sensor sensor : sensors)
			sensor.on();
	}

	@Override
	public void off() {
		for (Sensor sensor : sensors)
			sensor.off();
	}

	@Override
	public int measure() {
		int averageNeasure = 0;
		
		for (Sensor sensor : sensors)
			averageNeasure += sensor.measure();
		
		return averageNeasure / sensors.size();
	}

}
