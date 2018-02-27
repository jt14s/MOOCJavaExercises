package exercise40;

import javax.swing.SwingUtilities;

import exercise40.ui.CalculatorInterface;

public class Main {

	public static void main(String[] args) {
		CalculatorInterface ui = new CalculatorInterface();
		SwingUtilities.invokeLater(ui);
	}
}
