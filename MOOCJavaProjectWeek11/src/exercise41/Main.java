package exercise41;

import javax.swing.SwingUtilities;

class Main {

	public static void main(String[] args) {
		DrawingBoardUserInterface ui = new DrawingBoardUserInterface();
		SwingUtilities.invokeLater(ui);
	}
}
