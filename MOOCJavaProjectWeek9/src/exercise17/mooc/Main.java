package exercise17.mooc;

import exercise17.mooc.logic.ApplicationLogic;
import exercise17.mooc.ui.TextUserInterface;
import exercise17.mooc.ui.UserInterface;

class Main {

	public static void main(String[] args) {
		UserInterface ui = new TextUserInterface();
		new ApplicationLogic(ui).execute(3);
	}
}
