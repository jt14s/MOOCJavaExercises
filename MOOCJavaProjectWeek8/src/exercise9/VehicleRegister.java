package exercise9;

import java.util.HashMap;
import java.util.Map;

class VehicleRegister {
	
	private Map<RegistrationPlate, String> vehicles;
	
	public VehicleRegister() {
		vehicles = new HashMap<>();
	}
	
	public boolean add(RegistrationPlate plate, String owner) {
		if (!vehicles.containsKey(plate)) {
			vehicles.put(plate, owner);
			return true;
		}
		
		return false;
	}
	
	public String get(RegistrationPlate plate) {
		if (vehicles.containsKey(plate))
			return vehicles.get(plate);
		
		return null;
	}
	
	public boolean delete(RegistrationPlate plate) {
		if (vehicles.containsKey(plate)) {
			vehicles.remove(plate);
			return true;
		}
		
		return false;
	}
	
	public void printRegistrationPlates() {
		for (RegistrationPlate plate : vehicles.keySet())
			System.out.println(vehicles.get(plate));
	}
	
	public void printOwners() {
		for (String owner : vehicles.values())
			System.out.println(owner);
	}
}
