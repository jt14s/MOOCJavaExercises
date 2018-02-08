package exercise7;

import java.util.Scanner;

class TextUserInterface {

	private Scanner reader;
	private Dictionary dictionary;
	
	public TextUserInterface(Scanner reader, Dictionary dictionary) {
		this.reader = reader;
		this.dictionary = dictionary;
	}
	
	public void start() {
		printMenu();
		
		while (true) {
			System.out.print("Statement: ");
			String command = reader.nextLine().toLowerCase();
			
			if (command.equals("quit"))
				break;
			else if (command.equals("add"))
				add();
			else if (command.equals("translate"))
				translate();
			else
				System.out.println("Unknown statement");
			
			System.out.println("");
		}
		System.out.println("Cheers!");
	}

	private void printMenu() {
		System.out.println("Statement:");
		System.out.println("  add - adds a word pair to the dictionary");
		System.out.println("  translate - ask a word and prints its translation");
		System.out.println("  quit - quit the text user interface\n");
	}
	
	private void add() {
		String finnishWord;
		String translatedWord;
		
		System.out.print("In Finnish: ");
		finnishWord = reader.nextLine();
		System.out.print("Translation: ");
		translatedWord = reader.nextLine();

		dictionary.add(finnishWord, translatedWord);
	}
	
	private void translate() {
		String finnishWord;
		
		System.out.print("Give a word: ");
		finnishWord = reader.nextLine();
		
		String translation = dictionary.translate(finnishWord);
		if (translation != null)
			System.out.println("Translation: " + translation);
		else
			System.out.println("That word was not found in the dictionary.");
	}
}
