package exercise35.dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MindfulDictionary {

	private Map<String, String> words;
	private String fileName;
	
	public MindfulDictionary() {
		words = new HashMap<>();
	}
	
	public MindfulDictionary(String file) {
		words = new HashMap<>();
		this.fileName = file;
	}
	
	public void add(String word, String translation) {
		if (!words.containsKey(word))
			words.put(word, translation);
	}
	
	public String translate(String word) {
		if (word == null)
			return null;
		
		//check values
		if (words.containsKey(word))
			return words.get(word);
		
		//check keys
		if (words.containsValue(word)) {
			for (String entry : words.keySet()) {
				if (words.get(entry).equals(word))
					return entry;
			}
		}
		
		return null;
	}
	
	public void remove(String word) {
		if (word == null)
			return;
		
		if (words.containsKey(word))
			words.remove(word);
		
		else if (words.containsValue(word)) {
			for (String entry : words.keySet()) {
				if (words.get(entry).equals(word)) {
					words.remove(entry);
					return;
				}
			}
		}
	}
	
	public boolean load() {
		File sourceFile = new File(fileName);
		try (Scanner reader = new Scanner(sourceFile)){
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				String[] parts = line.split(":");
				this.add(parts[0], parts[1]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public boolean save() {
		try (FileWriter writer = new FileWriter(fileName)){
			for (String word : words.keySet())
				writer.write(word + ":" + words.get(word) + "\n");
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
}
