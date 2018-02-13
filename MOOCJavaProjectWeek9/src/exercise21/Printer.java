package exercise21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {

	private String filename;
	
	public Printer(String filename) {
		this.filename = filename;
	}
	
	public void printLinesWhichContain(String word ) {
		File file = new File(filename);
		Scanner reader = null;
		
		try {
			reader = new Scanner(file);
			while(reader.hasNext()) {
				String line = reader.nextLine();
				if (line.contains(word)) {
					System.out.println(line);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		reader.close();
	}
}
