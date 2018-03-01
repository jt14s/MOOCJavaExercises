package exercise49.wormgame.gui;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import exercise49.wormgame.Direction;
import exercise49.wormgame.domain.Worm;

public class KeyboardListener implements KeyListener {

	private Worm worm;
	
	public KeyboardListener(Worm worm) {
		this.worm = worm;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP)
			worm.setDirection(Direction.UP);
		else if (e.getKeyCode() == KeyEvent.VK_DOWN)
			worm.setDirection(Direction.DOWN);
		else if (e.getKeyCode() == KeyEvent.VK_LEFT)
			worm.setDirection(Direction.LEFT);
		else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			worm.setDirection(Direction.RIGHT);
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}
}
