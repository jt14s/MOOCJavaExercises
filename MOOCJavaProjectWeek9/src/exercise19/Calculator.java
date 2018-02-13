package exercise19;

class Calculator {

	public void multiplication(int param) {
		if (param < 0)
			throw new IllegalArgumentException();
	}
	
	public void binomialCoefficient(int subsetSize, int setSize) {
		if (subsetSize < 0|| setSize < 0)
			throw new IllegalArgumentException();
		
		if (subsetSize >= setSize)
			throw new IllegalArgumentException();
	}
}
