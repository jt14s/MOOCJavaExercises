package exercise23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

	private File filename;
	
	public WordInspection(File file) {
		filename = file;
	}
	
	public int wordCount() {
		int wordCount = 0;
		Scanner reader = null;
		
		try {
			reader = new Scanner(filename);
			while(reader.hasNext()) {
				String line = reader.nextLine();
				wordCount++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		reader.close();
		
		return wordCount;
	}
	
	public List<String> wordsContainingZ() {
		List<String> words = new ArrayList<>();
		Scanner reader = null;
		
		try {
			reader = new Scanner(filename);
			while(reader.hasNext()) {
				String line = reader.nextLine();
				if (line.toLowerCase().contains("z"))
					words.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		reader.close();
		
		return words;
	}
	
	public List<String> wordsEndingWithL() {
		List<String> words = new ArrayList<>();
		Scanner reader = null;
		
		try {
			reader = new Scanner(filename);
			while(reader.hasNext()) {
				String line = reader.nextLine();
				if (line.toLowerCase().endsWith("l"))
					words.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		reader.close();
		
		return words;
	}
	
	public List<String> palindromes() {
		List<String> words = new ArrayList<>();
		Scanner reader = null;
		
		try {
			reader = new Scanner(filename);
			while(reader.hasNext()) {
				String line = reader.nextLine();
				boolean isPalindrome = true;
			
				for (int i = 0, j = line.length()-1; i < j; ++i, --j)
					if (line.charAt(i) != line.charAt(j))
						isPalindrome = false;
				if (isPalindrome)
					words.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		reader.close();
		
		return words;
	}
	
	public List<String> wordsWhichContainAllVowels() {
		List<String> words = new ArrayList<>();
		Scanner reader = null;
		
		try {
			reader = new Scanner(filename);
			while(reader.hasNext()) {
				String line = reader.nextLine();
				if (line.contains("a") && line.contains("e") && line.contains("i") && line.contains("o")
						&& line.contains("u") && line.contains("y") && line.contains("ä") && line.contains("ö"))
					words.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		reader.close();
		
		return words;
	}
}
