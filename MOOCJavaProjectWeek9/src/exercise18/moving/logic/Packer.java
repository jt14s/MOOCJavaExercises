package exercise18.moving.logic;

import java.util.ArrayList;
import java.util.List;

import exercise18.moving.domain.Box;
import exercise18.moving.domain.Thing;

public class Packer {

private int boxVolume;
	
	public Packer(int boxesVolume) {
		this.boxVolume = boxesVolume;
	}
	
	public List<Box> packThings(List<Thing> things) {
		List<Box> boxes = new ArrayList<>();
		for (Thing thing : things) {
			Box box = new Box(boxVolume);
			box.addThing(thing);
			boxes.add(box);
		}
		
		return boxes;
	}
}
