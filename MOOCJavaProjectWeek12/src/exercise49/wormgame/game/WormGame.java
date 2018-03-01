package exercise49.wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.Timer;

import exercise49.wormgame.Direction;
import exercise49.wormgame.domain.Apple;
import exercise49.wormgame.domain.Worm;
import exercise49.wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {
	
	private Worm worm;
	private Apple apple;
	
	private int[] dimensions;
	private boolean continueGame;
	private Updatable updateable;
	
	public WormGame(int width, int height) {
		super(1000, null);
		
		this.continueGame = true;
		addActionListener(this);
		setInitialDelay(2000);
		this.dimensions = new int[] {width, height};
		worm = new Worm(width / 2, height / 2, Direction.DOWN);
		apple = new Apple(ThreadLocalRandom.current().nextInt(0, width - 1), ThreadLocalRandom.current().nextInt(0, height - 1));
	}
	
	public Worm getWorm() {
		return worm;
	}
	
	public void setWorm(Worm worm) {
		this.worm = worm;
	}
	
	public Apple getApple() {
		return apple;
	}
	
	public void setApple(Apple apple) {
		this.apple = apple;
	}

	public int[] getDimensions() {
		return dimensions;
	}
	
	public void setUpdatable(Updatable updatable) {
		this.updateable = updatable;
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (!continueGame)
			return;
		
		worm.move();
		if (worm.runsInto(apple)) {
			worm.grow();
			apple = null;
			setApple(new Apple(ThreadLocalRandom.current().nextInt(0, dimensions[0] - 1), ThreadLocalRandom.current().nextInt(0, dimensions[1] - 1)));
		}
		
		if (worm.runsIntoItself()) {
			continueGame = false;
		}
		
		updateable.update();
		setDelay(1000 / worm.getLength());
	}

	@Override
	public void setDelay(int length) {
		super.setDelay(length);
	}
}
