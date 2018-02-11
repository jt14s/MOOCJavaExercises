package exercise12;

import java.util.HashMap;
import java.util.Map;

class ShoppingBasket {

	Map<String, Purchase> products;
		
	public ShoppingBasket() {
		products = new HashMap<>();
	}
	
	public void add(String product, int price) {
		if (products.containsKey(product)) {
			products.get(product).increaseAmount();
		} else
		products.put(product, new Purchase(product, 1, price));
	}
	
	public int price() {
		int totalPrice = 0;
		for (Purchase product : products.values())
			totalPrice += product.price();
		
		return totalPrice;
	}
	
	public void print() {
		for (Purchase product : products.values())
			System.out.println(product);
	}
}
