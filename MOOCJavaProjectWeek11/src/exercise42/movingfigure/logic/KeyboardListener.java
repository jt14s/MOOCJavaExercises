package exercise42.movingfigure.logic;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener{

	private Component component;
	private Figure figure;
	
	public KeyboardListener(Component component, Figure figure) {
		this.component = component;
		this.figure = figure;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			figure.move(-5, 0);
		else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			figure.move(5, 0);
		
		if (e.getKeyCode() == KeyEvent.VK_UP)
			figure.move(0, -5);
		else if (e.getKeyCode() == KeyEvent.VK_DOWN)
			figure.move(0, 5);
		
		component.repaint();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}
}
