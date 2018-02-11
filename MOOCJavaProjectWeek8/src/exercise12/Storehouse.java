package exercise12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Storehouse {

	private Map<String, Integer> prices;
	private Map<String, Integer> stocks;
	
	public Storehouse() {
		prices = new HashMap<>();
		stocks = new HashMap<>();
	}
	
	public void addProduct(String product, int price, int stock) {
		if (stocks.containsKey(product)) {
			stocks.put(product, prices.get(product) + 1);
		} else {
			prices.put(product, price);
			stocks.put(product, stock);
		}
	}
	
	public int price(String product) {
		if (prices.containsKey(product))
			return prices.get(product);
		
		return -99;
	}
	
	public int stock(String product) {
		if (stocks.containsKey(product))
			return stocks.get(product);
		
		return 0;
	}
	
	public boolean take(String product) {
		if (stocks.containsKey(product)) {
			if (stocks.get(product) - 1 >= 0) {
				stocks.put(product, stocks.get(product) - 1);
				return true;
			} else
			return false;
		} else
			return false;
	}
	
	public Set<String> products() {
		return stocks.keySet();
	}
}
