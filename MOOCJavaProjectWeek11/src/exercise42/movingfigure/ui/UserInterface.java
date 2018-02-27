package exercise42.movingfigure.ui;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import exercise42.movingfigure.logic.Figure;
import exercise42.movingfigure.logic.KeyboardListener;

public class UserInterface implements Runnable {

	private Figure figure;
	private JFrame frame;
	
	public UserInterface(Figure figure) {
		this.figure = figure;
	}
	
	@Override
	public void run() {
		frame = new JFrame("Moving Figure");
		frame.setPreferredSize(new Dimension(800, 800));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}
	
	private void createComponents(Container container) {
		DrawingBoard drawingBoard = new DrawingBoard(figure);
		container.add(drawingBoard);
		addListeners(drawingBoard);
	}
	
	private void addListeners(DrawingBoard board) {
		frame.addKeyListener(new KeyboardListener(board, figure));
	}
}
