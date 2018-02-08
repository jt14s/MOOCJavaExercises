package exercise8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// This class is responsible for adding planes and flights, as well as prompting the view to print
// 		information regarding said things
class Airport {

	private Map<String, Plane> planes;
	private List<Flight> flights;
	
	public Airport() {
		planes = new HashMap<>();
		flights = new ArrayList<>();
	}
	
	public void addAirplane(String id, int capacity) {
		planes.put(id, new Plane(id, capacity));
	}
	
	public void addFlight(String planeID, String depCode, String arrCode) {
		if (planes.containsKey(planeID))
			flights.add(new Flight(planeID, depCode, arrCode));
		else
			System.out.println("That ID did not match a registered plane. Register it first.");
	}
	
	public void printPlanes() {
		List<String> output = new ArrayList<>();
		for (String plane : planes.keySet())
			output.add(planes.get(plane).toString());
		AirportConsoleView.printPlanes(output);
	}
	
	public void printFlights() {
		List<String> output = new ArrayList<>();
		for (Flight flight : flights)
			output.add(planes.get(flight.getPlaneID()) + " " + flight);
		AirportConsoleView.printFlights(output);
	}
	
	public void printPlaneInfo(String planeID) {
		if (planes.containsKey(planeID))
			AirportConsoleView.printPlaneInfo(planes.get(planeID).toString());
		else
			AirportConsoleView.printPlaneInfo(null);
	}
}
