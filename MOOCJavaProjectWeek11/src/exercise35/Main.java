package exercise35;

import exercise35.dictionary.MindfulDictionary;

class Main {

	public static void main(String[] args) {
		MindfulDictionary dict = new MindfulDictionary("src/words.txt");
		dict.load();

		// using the dictionary

		dict.save();
	}
}
