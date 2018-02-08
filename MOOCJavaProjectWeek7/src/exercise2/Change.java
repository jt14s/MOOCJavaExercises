package exercise2;

class Change {
	
	private char fromCharacter;
	private char toCharacter;
	
	public Change(char fromCharacter, char toCharacter) {
		this.fromCharacter = fromCharacter;
		this.toCharacter = toCharacter;
	}
	
	public String change(String characterString) {
		return characterString.replace(fromCharacter, toCharacter);
	}
	
	public static void main(String[] args) {
		String word = "carrot";
		
		Change change1 = new Change('a', 'b');
		word = change1.change(word);
		System.out.println(word);
		
		Change change2 = new Change('r', 'x');
		word = change2.change(word);
		System.out.println(word);
	}
}
