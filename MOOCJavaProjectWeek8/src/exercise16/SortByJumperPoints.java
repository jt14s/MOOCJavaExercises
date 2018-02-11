package exercise16;

import java.util.Comparator;

class SortByJumperPoints implements Comparator<Jumper> {

	@Override
	public int compare(Jumper jumper1, Jumper jumper2) {
		return jumper2.getTotalScore() - jumper1.getTotalScore();
	}
}
