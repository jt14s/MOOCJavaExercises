package exercise49.wormgame.gui;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import exercise49.wormgame.game.WormGame;

public class WormGameUI implements Runnable {

	private JFrame frame;
	private WormGame game;
	private DrawingBoard board;
	private int pieceLength;
	
	public WormGameUI(WormGame game, int pieceLength) {
		this.game = game;
		this.pieceLength = pieceLength;
	}
	
	@Override
	public void run() {
		frame = new JFrame("Wormmy");
		frame.setPreferredSize(new Dimension(200, 200));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}
	
	private void createComponents(Container container) {
		board = new DrawingBoard(game, pieceLength);
		container.add(board);
		frame.addKeyListener(new KeyboardListener(game.getWorm()));
	}
	
	public Updatable getUpdatable() {
		return board;
	}
}
