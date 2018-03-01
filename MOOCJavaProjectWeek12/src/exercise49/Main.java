package exercise49;

import javax.swing.SwingUtilities;

import exercise49.wormgame.game.WormGame;
import exercise49.wormgame.gui.WormGameUI;

class Main {

	public static void main(String[] args) {
		WormGame game = new WormGame(200, 200);

        WormGameUI ui = new WormGameUI(game, 20);
        SwingUtilities.invokeLater(ui);

        while (ui.getUpdatable() == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("The drawing board hasn't been created yet.");
            }
        }

        game.setUpdatable(ui.getUpdatable());
        game.start();
	}
}
