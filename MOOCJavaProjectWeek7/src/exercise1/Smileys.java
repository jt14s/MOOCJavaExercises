package exercise1;

class Smileys {
	
	public static void main(String[] args) {
		printWithSmileys("\\:D/");
		printWithSmileys("87.");
	}

	// calculates the correct output for the middle row
	// using that calculation, the border length is also found and printed
	private static void printWithSmileys(String characterString) {		
		StringBuilder outputString = new StringBuilder();
		outputString.append(":) " + characterString + " ");
		if (characterString.length() % 2 != 0)
			outputString.append(" :)");
		else
			outputString.append(":)");
		
		printBorder(outputString.length() / 2);
		System.out.println(outputString);
		printBorder(outputString.length() / 2);
	}
	
	// prints the bottom and top borders
	private static void printBorder(int length) {
		for(int i = 0; i < length; ++i)
			System.out.print(":)");
		System.out.println();
	}
}
