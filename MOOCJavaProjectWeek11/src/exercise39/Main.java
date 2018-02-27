package exercise39;

import exercise39.clicker.ui.UserInterface;
import exercise39.clicker.application.logic.PersonalCalculator;

import javax.swing.SwingUtilities;

class Main {

	public static void main(String[] args) {
		UserInterface ui = new UserInterface(new PersonalCalculator());
		SwingUtilities.invokeLater(ui);
	}
}
