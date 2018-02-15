package exercise31.farmsimulator;

import java.util.concurrent.ThreadLocalRandom;

public class Cow implements Milkable, Alive{

	private String name;
	private double utterCapacity;
	private double milk;
	
	private static final String[] NAMES = new String[]{
	        "Anu", "Arpa", "Essi", "Heluna", "Hely",
	        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
	        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
	        "Mainikki", "Mella", "Mimmi", "Naatti",
	        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
	        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
	
	public Cow() {
		this.name = NAMES[ThreadLocalRandom.current().nextInt(0, NAMES.length)];
		utterCapacity = ThreadLocalRandom.current().nextDouble(15.0, 40.0 + 1.0);
		milk = 0.0;
	}
	
	public Cow(String name) {
		this.name = name;
		utterCapacity = ThreadLocalRandom.current().nextDouble(15.0, 40.0 + 1.0);
		milk = 0.0;
	}
	
	public String getName() {
		return name;
	}
	
	public double getCapacity() {
		return utterCapacity;
	}
	
	public double getAmount() {
		return milk;
	}
	
	@Override
	public void liveHour() {
		milk += ThreadLocalRandom.current().nextDouble(0.7, 2.0 + 1.0);
		if (milk > utterCapacity)
			milk = utterCapacity;
	}

	@Override
	public double milk() {
		double milkAmount = milk;
		milk = 0.0;
		return milkAmount;
	}
	
	@Override
	public String toString() {
		return name + " " + Math.ceil(milk) + "/" + Math.ceil(utterCapacity);
	}
}
