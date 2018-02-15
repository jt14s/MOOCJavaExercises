package exercise31;

import exercise31.farmsimulator.Barn;
import exercise31.farmsimulator.BulkTank;
import exercise31.farmsimulator.Cow;
import exercise31.farmsimulator.Farm;
import exercise31.farmsimulator.MilkingRobot;

class Main {

	public static void main(String[] args) {
		Farm farm = new Farm("Esko", new Barn(new BulkTank()));
		MilkingRobot robot = new MilkingRobot();
		farm.installMilkingRobot(robot);

		farm.addCow(new Cow());
		farm.addCow(new Cow());
		farm.addCow(new Cow());


		farm.liveHour();
		farm.liveHour();

		farm.manageCows();

		System.out.println(farm);
	}
}
