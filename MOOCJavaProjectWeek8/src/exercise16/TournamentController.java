package exercise16;

import java.util.Scanner;

class TournamentController {
	
	private Scanner reader = new Scanner(System.in);
	private SkiTournament tournament = new SkiTournament();

	public void start() {		
		String userInput = "";
		
		getJumperNamesFromUser();
		while (true) {
			System.out.print("Write \"jump\" to jump; otherwise you quit: ");
			userInput = reader.nextLine();
			if (userInput.equals("jump")) {
				System.out.println("\nRound " + tournament.getRound() + "\n");
				tournament.startRound();
				System.out.println("");
			} else
				break;
		}
		
		tournament.printTournamentStatistics();
		reader.close();
	}

	private void getJumperNamesFromUser() {
		String jumperName = "";
		System.out.println("Kumpla ski jumping week\n");
		System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
		while (true) {
			System.out.print("  Participant name: ");
			jumperName = reader.nextLine();
			if (jumperName.isEmpty())
				break;
			else
				tournament.addJumper(jumperName);
		}
		System.out.println("\nThe tournament begins!\n");
	}
}
