package exercise2;

import java.util.ArrayList;
import java.util.List;

class Changer {
	
	List<Change> changes;
	
	public Changer() {
		changes = new ArrayList<>();
	}
	
	public void addChange(Change change) {
		changes.add(change);
	}
	
	public String change(String characterString) {
		for (Change change : changes)
			characterString = change.change(characterString);
		
		return characterString;
	}
	
	public static void main(String[] args) {
		  Changer scandiesAway = new Changer();
		  scandiesAway.addChange(new Change('�', 'a'));
		  scandiesAway.addChange(new Change('�', 'o'));
		  System.out.println(scandiesAway.change("��li� �l� ly�, ��li� l�ikkyy"));
	}
}
