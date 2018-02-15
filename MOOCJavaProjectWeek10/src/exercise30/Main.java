package exercise30;

import exercise30.containers.ProductContainer;

class Main {

	public static void main(String[] args) {
		ProductContainer juice = new ProductContainer("Juice", 1000.0);
        juice.addToTheContainer(1000.0);
        juice.takeFromTheContainer(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToTheContainer(1.0);
        System.out.println(juice);
	}
}
