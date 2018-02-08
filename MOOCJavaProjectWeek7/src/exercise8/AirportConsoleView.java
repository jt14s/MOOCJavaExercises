package exercise8;

import java.util.List;
import java.util.Scanner;

// This class is responsible for all of the output in the program
class AirportConsoleView {
	
	public static void printPanelHeader(int flag) {
		if (flag == 1) {
			System.out.println("Airport panel");
			System.out.println("--------------------\n");
		} else {
			System.out.println("\nFlight service");
			System.out.println("--------------------\n");
		}
	}
	
	public static void printPanelMenu() {
		System.out.println("Choose operation:");
		System.out.println("[1] Add airplane");
		System.out.println("[2] Add flight");
		System.out.println("[3] Exit");
		System.out.print("> ");
	}
	
	public static void printServiceMenu() {
		System.out.println("Choose operation:");
		System.out.println("[1] Print planes");
		System.out.println("[2] Print flights");
		System.out.println("[2] Print plane info");
		System.out.println("[3] Quit");
		System.out.print("> ");
	}
	
	public static String[] promptAddPlane(Scanner reader) {
		String[] userInput = new String[2];
		
		System.out.print("Give plane ID: ");
		userInput[0] = reader.nextLine();
		System.out.print("Give plane capacity: ");
		userInput[1] = reader.nextLine();
		
		return userInput;
	}
	
	public static String[] promptAddFlight(Scanner reader) {
		String[] userInput = new String[3];
		
		System.out.print("Give plane ID: ");
		userInput[0] = reader.nextLine();
		System.out.print("Give departure airport code: ");
		userInput[1] = reader.nextLine();
		System.out.print("Give destination airport code: ");
		userInput[2] = reader.nextLine();
		
		return userInput;
	}
	
	public static void printInvalidEntryWarning() {
		System.out.println("Invalid entry. Try again.");
	}
	
	public static String promptSearchPlane(Scanner reader) {
		System.out.print("Give plane ID: ");
		return reader.nextLine();
	}
	
	public static void printPlanes(List<String> planes) {
		for (String planeInfo : planes)
			System.out.println(planeInfo);
		System.out.println("");
	}
	
	public static void printFlights(List<String> flights) {
		for (String flightInfo : flights)
			System.out.println(flightInfo);
		System.out.println("");
	}
	
	public static void printPlaneInfo(String planeID) {
		if (planeID != null)
			System.out.println(planeID);
		else
			System.out.println("That plane is not registered at this airport.");
		System.out.println("");
	}
}
