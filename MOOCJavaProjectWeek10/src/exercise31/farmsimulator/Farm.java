package exercise31.farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive {

	private String owner;
	private Barn barn;
	private List<Cow> cows;
	
	public Farm(String name, Barn barn) {
		cows = new ArrayList<>();
		this.owner = name;
		this.barn = barn;
	}
	
	public void manageCows() {
		for (Cow cow : cows)
			barn.takeCareOf(cow);
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void addCow(Cow cow) {
		cows.add(cow);
	}
	
	public void installMilkingRobot(MilkingRobot robot) {
		barn.installMilkingRobot(robot);
	}
	
	@Override
	public void liveHour() {
		for (Cow cow : cows)
			cow.liveHour();
	}
	
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder("Farm owner: " + owner + "\n");
		output.append("Barn bulk tank: " + barn.toString() + "\n");
		
		if (cows.isEmpty())
			output.append("No cows.");
		else {
			output.append("Animals:\n");
			for(Cow cow : cows)
				output.append("\t" + cow.toString() + "\n");
		}
		return output.toString();
	}
}
