package exercise31.farmsimulator;

import java.util.Collection;

public class Barn {

	private BulkTank tank;
	private MilkingRobot robot;
	
	public Barn(BulkTank tank) {
		this.tank = tank;
	}
	
	public BulkTank getBulkTank() {
		return tank;
	}
	
	public void installMilkingRobot(MilkingRobot milkingRobot) {
		robot = milkingRobot;
		robot.setBulkTank(tank);
	}
	
	public void takeCareOf(Cow cow) {
		if (robot != null)
			robot.milk(cow);
		else
			throw new IllegalArgumentException("The MilkingRobot hasn't been installed");
	}
	
	public void takeCareOf(Collection<Cow> cows) {
		if (robot != null) {
			for (Cow cow : cows)
				robot.milk(cow);
		} else {
			throw new IllegalArgumentException("The MilkingRobot hasn't been installed");
		}
	}
	
	@Override
	public String toString() {
		return tank.toString();
	}
}
