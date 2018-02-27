package exercise34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		FileManager f = new FileManager();
		
		for (String line : f.read("src/testinput1.txt")) {
			System.out.println(line);
		}
		
		f.save("src/testinput1.txt", "third\n");
		ArrayList<String> texts = new ArrayList<>(Arrays.asList("text1", "text2", "text3", "text4", "text5"));
		f.save("src/testinput1.txt", texts);
	}
}
