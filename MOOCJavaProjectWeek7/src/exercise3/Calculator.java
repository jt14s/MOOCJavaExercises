package exercise3;

class Calculator {
	
	private Reader reader;
	private int calculationsDone;
	
	public Calculator() {
		reader = new Reader();
		calculationsDone = 0;
	}
	
	public void start() {
		String command;
		while (true) {
			System.out.print("command: ");
			command = reader.readString();
			
			if (command.equals("end"))
				break;
			if (command.equals("sum")) {
				sum();
				calculationsDone++;
			} else if (command.equals("difference")) {
				difference();
				calculationsDone++;
			} else if (command.equals("product")) {
				product();
				calculationsDone++;
			}
		}
		statistics();
	}
	
	private void sum() {
		int[] values = getValues();
		System.out.println("sum of the values " +String.valueOf(values[0] + values[1]) + "\n");
	}
	
	private void difference() {
		int[] values = getValues();
		System.out.println("sum of the values " +String.valueOf(values[0] - values[1]) + "\n");
	}
	
	private void product() {
		int[] values = getValues();
		System.out.println("sum of the values " +String.valueOf(values[0] * values[1]) + "\n");
	}
	
	private int[] getValues() {
		int[] values = new int[2];
		System.out.print("Value1: ");
		values[0] = reader.readInteger();
		System.out.print("Value2: ");
		values[1] = reader.readInteger();
		
		return values;
	}
	
	private void statistics() {
		System.out.println("Calculations done " + String.valueOf(calculationsDone));
	}
}
