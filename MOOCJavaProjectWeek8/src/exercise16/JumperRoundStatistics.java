package exercise16;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

class JumperRoundStatistics {

	private int jumpLength;
	private List<Integer> judgeScores;
	
	public JumperRoundStatistics() {
		judgeScores = new LinkedList<>();
	}
	
	public void generateStatistics() {
		generateJumpLength();
		generateJudgeScores();
	}
	
	public int getScore() {
		return jumpLength + tallyJudgeScores();
	}
	
	public int getJumpLength() {
		return jumpLength;
	}

	private void generateJumpLength() {
		jumpLength = ThreadLocalRandom.current().nextInt(60, 120 + 1);
	}
	
	private void generateJudgeScores() {		
		for (int i = 0; i < 5; ++i)
			judgeScores.add(ThreadLocalRandom.current().nextInt(10, 20 + 1));
	}
	
	private int tallyJudgeScores() {
		int totalScore = 0;
		
		Collections.sort(judgeScores);
		judgeScores.remove(judgeScores.size() - 1);
		judgeScores.remove(0);
		
		for (int score : judgeScores)
			totalScore += score;
		
		return totalScore;
	}
	
	@Override
	public String toString() {
		int i = 0;
		StringBuilder valueToPrint = new StringBuilder("    length: " + jumpLength + "\n    judge votes: [");
		
		for (; i < judgeScores.size() - 1; ++i)
			valueToPrint.append(judgeScores.get(i) + ", ");
		valueToPrint.append(judgeScores.get(i) + "]");
		
		return valueToPrint.toString();
	}
}
