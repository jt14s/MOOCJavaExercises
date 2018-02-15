package exercise31.farmsimulator;

public class MilkingRobot {

	private BulkTank tank;
	
	public MilkingRobot() {
		//tank = new BulkTank();
	}
	
	public BulkTank getBulkTank() {
		return tank;
	}
	
	public void setBulkTank(BulkTank tank) {
		this.tank = tank;
	}
	
	public void milk(Milkable milkable) {
		if (tank != null)
			tank.addToTank(milkable.milk());
		else
			throw new IllegalArgumentException("The MilkingRobot hasn't been installed");
	}
}
