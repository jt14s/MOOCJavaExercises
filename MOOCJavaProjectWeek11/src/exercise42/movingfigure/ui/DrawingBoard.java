package exercise42.movingfigure.ui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import exercise42.movingfigure.logic.Figure;

public class DrawingBoard extends JPanel {

	private static final long serialVersionUID = 1L;
	private Figure figure;
	
	public DrawingBoard(Figure figure) {
		super.setBackground(Color.WHITE);
		this.figure = figure;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		super.paintComponent(g);
		figure.draw(g);
	}
}
