package exercise8;

// This class stores flight information
class Flight {

	private String planeID;
	private String departCode;
	private String arriveCode;
	
	public Flight(String planeID, String depCode, String arrCode) {
		this.planeID = planeID;
		this.departCode = depCode;
		this.arriveCode = arrCode;
	}
	
	public String getPlaneID() {
		return planeID;
	}
	
	@Override
	public String toString() {
		return new StringBuilder("(" + departCode + "-" + arriveCode + ")").toString();
	}
}
