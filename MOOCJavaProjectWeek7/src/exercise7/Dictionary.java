package exercise7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Dictionary {
	
	private Map<String, String> dictionary;
	
	public Dictionary() {
		dictionary = new HashMap<>();
	}
	
	public String translate(String word) {
		if (dictionary.containsKey(word))
			return dictionary.get(word);
		else
			return null;
	}
	
	public void add(String word, String translation) {
		dictionary.put(word, translation);
	}
	
	public int amountOfWords() {
		return dictionary.size();
	}
	
	public ArrayList<String> translationList() {
		ArrayList<String> translationlist = new ArrayList<>();
		
		for (String key : dictionary.keySet())
			translationlist.add(key + " = " + dictionary.get(key));
		
		return translationlist;
	}

	public static void main(String[] args) {
		Dictionary dictionary = new Dictionary();
	    dictionary.add("apina", "monkey");
	    dictionary.add("banaani", "banana");
	    dictionary.add("cembalo", "harpsichord");

	    ArrayList<String> translations = dictionary.translationList();
	    for(String translation: translations) {
	        System.out.println(translation);
	    }
	}
}
