package exercise18;

import java.util.ArrayList;
import java.util.List;

import exercise18.moving.domain.Box;
import exercise18.moving.domain.Item;
import exercise18.moving.domain.Thing;
import exercise18.moving.logic.Packer;

class Main {

	public static void main(String[] args) {
		List<Thing> things = new ArrayList<Thing>();
	    things.add(new Item("passport", 2));
	    things.add(new Item("toothbrash", 1));
	    things.add(new Item("book", 4));
	    things.add(new Item("circular saw", 8));

	    // we create a packer which uses boxes whose valume is 10
	    Packer packer = new Packer(10);

	    // we ask our packer to pack things into boxes
	    List<Box> boxes = packer.packThings( things );

	    System.out.println("number of boxes: "+boxes.size());

	    for (Box box : boxes) {
	        System.out.println("  things in the box: "+box.getVolume()+" dm^3");
	    }
	}
}
