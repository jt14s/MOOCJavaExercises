package exercise10;

class MilitaryService implements NationalService {

	private int daysLeft;
	
	public MilitaryService(int daysLeft) {
		this.daysLeft = daysLeft;
	}
	
	@Override
	public int getDaysLeft() {
		return daysLeft;
	}

	@Override
	public void work() {
		if (daysLeft - 1 < 0)
			System.out.println("No more days left to work");
		else
			daysLeft--;
	}
}
