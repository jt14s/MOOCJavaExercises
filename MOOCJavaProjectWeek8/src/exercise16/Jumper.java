package exercise16;

import java.util.ArrayList;
import java.util.List;

class Jumper implements Comparable<Jumper> {

	private String name;
	private int totalScore;
	private List<JumperRoundStatistics> roundStatistics;
	
	public Jumper(String name) {
		roundStatistics = new ArrayList<>();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTotalScore() {
		return totalScore;
	}
	
	public String getJumpLengths() {
		StringBuilder jumpsString = new StringBuilder("jump lengths: ");
		
		for (JumperRoundStatistics statistic : roundStatistics)
			jumpsString.append(statistic.getJumpLength() + "m, ");
		
		jumpsString.delete(jumpsString.length() - 2, jumpsString.length());
		
		return jumpsString.toString();
	}
	
	public void jump() {
		JumperRoundStatistics round = new JumperRoundStatistics();
		round.generateStatistics();
		roundStatistics.add(round);
	}

	public void endRound(int round) {
		totalScore += roundStatistics.get(round).getScore();
	}
	
	public void printRoundStatistics(int round) {
		System.out.println(roundStatistics.get(round));
	}
	
	public String toString() {
		return name + " (" + totalScore + " points)";
	}

	@Override
	public int compareTo(Jumper opponent) {
		return totalScore - opponent.totalScore;
	}
}
