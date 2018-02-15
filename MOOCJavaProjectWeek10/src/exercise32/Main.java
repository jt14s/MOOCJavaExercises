package exercise32;

import exercise32.boxes.BlackHoleBox;
import exercise32.boxes.Thing;

class Main {

	public static void main(String[] args) {
		BlackHoleBox box = new BlackHoleBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));

        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox(new Thing("Pirkka")));
	}
}
