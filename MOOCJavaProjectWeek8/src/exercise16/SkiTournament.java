package exercise16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SkiTournament {

	private List<Jumper> jumpers;
	private int round;
	
	public SkiTournament() {
		jumpers = new ArrayList<>();
		round = 1;
	}
	
	public int getRound() {
		return round;
	}
	
	public void addJumper(String name) {
		jumpers.add(new Jumper(name));
	}
	
	public void startRound() {
		System.out.println("Jumping order:");
		printJumpers();
		
		for (Jumper jumper : jumpers)
			jumper.jump();
		
		System.out.println("\nResults of round " + round);
		for (Jumper jumper : jumpers) {
			System.out.println("  " + jumper.getName());
			jumper.printRoundStatistics(round - 1);
			jumper.endRound(round - 1);
		}
		
		Collections.sort(jumpers);
		round++;
	}
	
	public void printJumpers() {
		for (int i = 0; i < jumpers.size(); ++i)
			System.out.println("  " + (i + 1) + ". " + jumpers.get(i));
	}
	
	public void printTournamentStatistics() {
		Collections.sort(jumpers, new SortByJumperPoints());
		System.out.println("Tournament Results:\nPosition    Name");
		for (int i = 0; i < jumpers.size(); ++i) {
			System.out.println((i + 1) + "         " + jumpers.get(i));
			System.out.println("          " + jumpers.get(i).getJumpLengths());
		}
	}
}
