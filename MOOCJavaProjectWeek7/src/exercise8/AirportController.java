package exercise8;

import java.util.Scanner;

// This class is responsible for setting up a work environment where the data classes can be used
class AirportController {
	
	public void start() {
		Scanner reader = new Scanner(System.in);
		Airport airport = new Airport();
		boolean operating = true;
		
		AirportConsoleView.printPanelHeader(1);
		while (operating) {
			AirportConsoleView.printPanelMenu();
			String operation = reader.nextLine().trim();
			switch(operation) {
			case "1":
				String[] planeInfo = AirportConsoleView.promptAddPlane(reader);
				airport.addAirplane(planeInfo[0], Integer.parseInt(planeInfo[1]));
				break;
			case "2":
				String[] flightInfo = AirportConsoleView.promptAddFlight(reader);
				airport.addFlight(flightInfo[0], flightInfo[1], flightInfo[2]);
				break;
			case "x":
				operating = false;
				break;
			default:
				AirportConsoleView.printInvalidEntryWarning();
			}
		}
		
		AirportConsoleView.printPanelHeader(2);
		operating = true;
		
		while (operating) {
			AirportConsoleView.printServiceMenu();
			String operation = reader.nextLine().trim();
			switch(operation) {
			case "1":
				airport.printPlanes();
				break;
			case "2":
				airport.printFlights();
				break;
			case "3":
				airport.printPlaneInfo(AirportConsoleView.promptSearchPlane(reader));
				break;
			case "x":
				operating = false;
				break;
			default:
				AirportConsoleView.printInvalidEntryWarning();
			}
		}
		reader.close();
	}
}
