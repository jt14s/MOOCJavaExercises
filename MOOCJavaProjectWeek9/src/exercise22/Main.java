package exercise22;

import java.io.File;

import exercise22.file.Analysis;

class Main {

	public static void main(String[] args) {
		File file = new File("src/exercise22/textfile.txt");
	    Analysis analysis = new Analysis(file);
	    System.out.println("Lines: " + analysis.lines());
	    System.out.println("Characters: " + analysis.characters());
	}
}
