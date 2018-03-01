package exercise44;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			//weekday test
			System.out.print("Give a string: ");
			if (isAWeekDay(input.nextLine()))
				System.out.println("The form is fine.");
			else
				System.out.println("The form is wrong.");
			
			//vowel test
			System.out.print("Give a string: ");
			if (allVowels(input.nextLine()))
				System.out.println("The form is fine.");
			else
				System.out.println("The form is wrong.");
			
			//time test
			System.out.print("Give a string: ");
			if (clockTime(input.nextLine()))
				System.out.println("The form is fine.");
			else
				System.out.println("The form is wrong.");
		} catch (Exception e) {
			System.out.println("Scanner not available.");
		}
	}
	
	public static boolean isAWeekDay(String string) {
		return string.toLowerCase().matches("mon|tue|wed|thu|fri|sat|sun");
	}
	
	public static boolean allVowels(String string) {
		return string.toLowerCase().matches("(a|e|i|o|u)+");
	}
	
	public static boolean clockTime(String string) {
		return string.matches("[0-2]?[0-9]:[0-5][0-9]:[0-5][0-9]");
	}
}
