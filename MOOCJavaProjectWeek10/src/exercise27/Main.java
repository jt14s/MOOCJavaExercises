package exercise27;

class Main {

	public static void main(String[] args) {
		RingingCenter kumpulaCentre = new RingingCenter();

	    kumpulaCentre.observe( new Bird("Rose Starling", "Sturnus roseus", 2012), "Arabia" );
	    kumpulaCentre.observe( new Bird("Rose-Coloured Starling", "Sturnus roseus", 2012), "Vallila" );
	    kumpulaCentre.observe( new Bird("European Herring Gull", "Larus argentatus", 2008), "Kumpulanmäki" );
	    kumpulaCentre.observe( new Bird("Rose Starling", "Sturnus roseus", 2008), "Mannerheimintie" );

	    kumpulaCentre.observations( new Bird("Rose-Coloured Starling", "Sturnus roseus", 2012 ) );
	    System.out.println("--");
	    kumpulaCentre.observations( new Bird("European Herring Gull", "Larus argentatus", 2008 ) );
	    System.out.println("--");
	    kumpulaCentre.observations( new Bird("European Herring Gull", "Larus argentatus", 1980 ) );
	}
}
