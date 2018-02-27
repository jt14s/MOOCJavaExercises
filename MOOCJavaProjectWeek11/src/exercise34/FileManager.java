package exercise34;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

	public List<String> read(String file) {
		List<String> content = new ArrayList<>();
		File fileToRead = new File(file);
		
		try (Scanner reader = new Scanner(fileToRead)){
			while(reader.hasNext()) {
				String line = reader.nextLine();
				content.add(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		
		return content;
	}
	
	public void save(String file, String message) {
		try (FileWriter writer = new FileWriter(file, true)){
			writer.write(message);
		} catch (IOException e) {
			System.out.println("File not found");
		}
	}
	
	public void save(String file, ArrayList<String> texts) {
		try (FileWriter writer = new FileWriter(file)){
			for (String text : texts)
				writer.write(text + "\n");
		} catch (IOException e) {
			System.out.println("File not found");
		}
	}
}
