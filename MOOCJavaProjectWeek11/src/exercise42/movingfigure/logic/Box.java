package exercise42.movingfigure.logic;

import java.awt.Color;
import java.awt.Graphics;

public class Box extends Figure {

	private int length;
	private int height;
	
	public Box(int x, int y, int length, int height) {
		super(x, y);
		this.length = length;
		this.height = height;
	}
	
	@Override
	public void draw(Graphics graphics) {
		graphics.fillRect(x, y, length, height);
	}	
}
