package exercise5;

import java.util.HashMap;
import java.util.Map;

class HashMapExample {

	public static void main(String[] args) {
		Map<String, String> nicknames = new HashMap<>();
		
		nicknames.put("matti", "mage");
		nicknames.put("mikael", "mixu");
		nicknames.put("arto", "arppa");
		
		System.out.println(nicknames.get("mikael"));
	}
}
