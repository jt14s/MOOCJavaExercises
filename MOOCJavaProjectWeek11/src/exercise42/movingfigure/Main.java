package exercise42.movingfigure;

import javax.swing.SwingUtilities;

import exercise42.movingfigure.logic.Box;
import exercise42.movingfigure.logic.Circle;
import exercise42.movingfigure.logic.CompoundFigure;
import exercise42.movingfigure.ui.UserInterface;

class Main {

	public static void main(String[] args) {
		CompoundFigure truck = new CompoundFigure();

        truck.add(new Box(220, 110, 75, 100));
        truck.add(new Box(80, 120, 200, 100));
        truck.add(new Circle(100, 200, 50));
        truck.add(new Circle(220, 200, 50));

        UserInterface ui = new UserInterface(truck);
        SwingUtilities.invokeLater(ui);
	}
}
