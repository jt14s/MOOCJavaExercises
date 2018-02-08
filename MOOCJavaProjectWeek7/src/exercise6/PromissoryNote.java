package exercise6;

import java.util.HashMap;
import java.util.Map;

class PromissoryNote {

	Map<String, Double> notes;
	
	public PromissoryNote() {
		notes = new HashMap<>();
	}
	
	public void setLoan(String toWhom, double value) {
		notes.put(toWhom, value);
	}
	
	public double howMuchIsTheDebt(String whose) {
		if (notes.containsKey(whose))
			return notes.get(whose);
		else
			return 0;
	}
	
	public static void main(String[] args) {
		PromissoryNote mattisNote = new PromissoryNote();
		mattisNote.setLoan("Arto", 51.5);
		mattisNote.setLoan("Arto", 10.5);
	
		System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
	}
}
