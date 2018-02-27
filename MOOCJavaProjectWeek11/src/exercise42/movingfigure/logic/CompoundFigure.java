package exercise42.movingfigure.logic;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class CompoundFigure extends Figure {

	private List<Figure> figures;
	
	public CompoundFigure() {
		super(0, 0);
		figures = new ArrayList<>();
	}
	
	public void add(Figure figure) {
		figures.add(figure);
	}
	
	@Override
	public void draw(Graphics graphics) {
		for (Figure figure : figures)
			figure.draw(graphics);
	}
	
	@Override
	public void move(int dx, int dy) {
		for (Figure figure : figures)
			figure.move(dx, dy);
	}
}
