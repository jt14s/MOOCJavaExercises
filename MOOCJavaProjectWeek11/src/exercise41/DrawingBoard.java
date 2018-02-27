package exercise41;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

	public DrawingBoard() {
		super.setBackground(Color.WHITE);
	}
	
	@Override
	protected void paintComponent(Graphics graphics) {
		graphics.setColor(Color.DARK_GRAY);
		//eyes
		graphics.fillRect(100, 100, 50, 50);
		graphics.fillRect(335, 100, 50, 50);
		
		//mouth
		graphics.fillRect(50, 300, 50, 50);
		graphics.fillRect(385, 300, 50, 50);
		graphics.fillRect(100, 350, 285, 50);
	}
}
