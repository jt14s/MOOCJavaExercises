package exercise26;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Directory directory = new Directory();
		Scanner reader = new Scanner(System.in);
		String input = "";
		boolean run = true;
		
		printMenu();
		while (run) {
			System.out.print("command: ");
			input = reader.nextLine();
			switch (input) {
			case "1":
				addNumber(directory, reader);
				break;
			case "2":
				searchForNumber(directory, reader);
				break;
			case "3":
				searchByNumber(directory, reader);
				break;
			case "4":
				addAddress(directory, reader);
				break;
			case "5":
				searchInformation(directory, reader);
				break;
			case "6":
				removeInformation(directory, reader);
				break;
			case "7":
				searchByFilter(directory, reader);
				break;
			case "x":
				run = false;
				break;
			default:
				System.out.println(" Invalid Command. Try again");
				break;
			}
			System.out.println("");
		}
	}

	private static void searchByFilter(Directory directory, Scanner reader) {
		String filter;
		System.out.print("keyword (if empty, all listed):");
		filter = reader.nextLine();
		directory.searchByFilter(filter);
	}

	private static void removeInformation(Directory directory, Scanner reader) {
		String name;
		System.out.print("whose information: ");
		name = reader.nextLine();
		directory.removeInformation(name);
	}

	private static void searchInformation(Directory directory, Scanner reader) {
		String name;
		System.out.print("whose information: ");
		name = reader.nextLine();
		directory.searchPersonInfo(name);
	}

	private static void addAddress(Directory directory, Scanner reader) {
		String name, address;
		System.out.print("whose address: ");
		name = reader.nextLine();
		System.out.print("address: ");
		address = reader.nextLine();
		directory.addAddress(name, address);
	}

	private static void searchByNumber(Directory directory, Scanner reader) {
		String number;
		System.out.print("number: ");
		number = reader.nextLine();
		directory.searchName(number);
	}

	private static void searchForNumber(Directory directory, Scanner reader) {
		String name;
		System.out.print("whose number: ");
		name = reader.nextLine();
		directory.searchNumber(name);
	}

	private static void addNumber(Directory directory, Scanner reader) {
		String name, number;
		System.out.print("whose number: ");
		name = reader.nextLine();
		System.out.print("number: ");
		number = reader.nextLine();
		directory.addNumber(name, number);
	}

	private static void printMenu() {
		System.out.println("phone search");
		System.out.println("options available:");
		System.out.println(" 1 add a number");
		System.out.println(" 2 search for a number");
		System.out.println(" 3 search for a person by phone number");
		System.out.println(" 4 add an address");
		System.out.println(" 5 search for personal information");
		System.out.println(" 6 delete personal information");
		System.out.println(" 7 filtered listing");
		System.out.println(" x quit\n");
	}
}
