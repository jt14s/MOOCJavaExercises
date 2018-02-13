package exercise22.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {

	private File filename;
	
	public Analysis(File file) {
		filename = file;
	}
	
	public int characters() {
		int characterCount = 0;		
		Scanner reader = null;
		
		try {
			reader = new Scanner(filename);
			while (reader.hasNext()) {
				String line = reader.nextLine();
				characterCount += line.length();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		if (reader != null)
			reader.close();
		
		return characterCount;
	}
	
	public int lines() {
		int lineCount = 0;
		Scanner reader = null;
		
		try {
			reader = new Scanner(filename);
			while (reader.hasNext()) {
				String line = reader.nextLine();
				lineCount++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		if (reader != null)
			reader.close();
		
		return lineCount;
	}
}
