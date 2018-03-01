package exercise49.wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import exercise49.wormgame.domain.Piece;
import exercise49.wormgame.game.WormGame;

public class DrawingBoard extends JPanel implements Updatable {

	private WormGame game;
	private int pieceLength;
	
	public DrawingBoard(WormGame game, int pieceLength) {
		super.setBackground(Color.GRAY);
		this.game = game;
		this.pieceLength = pieceLength;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.fillOval(game.getApple().getX(), game.getApple().getY(), pieceLength, pieceLength);
		
		g.setColor(Color.BLACK);
		for (Piece piece : game.getWorm().getPieces())
			g.fill3DRect(piece.getX(), piece.getY(), pieceLength, pieceLength, true);
	}
	
	@Override
	public void update() {
		super.repaint();
	}
}
