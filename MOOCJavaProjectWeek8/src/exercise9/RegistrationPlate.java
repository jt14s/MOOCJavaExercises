package exercise9;

import java.util.ArrayList;
import java.util.HashMap;

class RegistrationPlate {

	private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
       this.regCode = regCode;
       this.country = country;
    }

    public String getRegCode() {
		return regCode;
	}

	public String getCountry() {
		return country;
	}

	@Override
    public String toString(){
        return country+ " "+regCode;
    }
    
    @Override
    public boolean equals(Object obj) {
    	if (obj == null)
    		return false;
    	
    	if (regCode == null || country == null)
    		return false;
    	
    	RegistrationPlate compare = (RegistrationPlate) obj;
    	if (regCode != compare.getRegCode() && country != compare.getCountry())
    		return false;
    	
    	return true;
    }
    
    @Override
    public int hashCode() {
    	if (regCode == null)
    		return 7;
    	
    	return regCode.hashCode() + country.hashCode();
    }
    
    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<RegistrationPlate>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newPlate = new RegistrationPlate("FI", "ABC-123");
        if (!finnish.contains(newPlate)) {
            finnish.add(newPlate);
        }
        System.out.println("Finnish: " + finnish);

        HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
        owners.put(reg1, "Arto");
        owners.put(reg3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new RegistrationPlate("FI", "ABC-123")));
        System.out.println(owners.get(new RegistrationPlate("D", "B WQ-431")));
    }
}
