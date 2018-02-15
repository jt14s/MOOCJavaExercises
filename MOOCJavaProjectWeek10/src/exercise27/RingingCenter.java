package exercise27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RingingCenter {

	private Map<Bird, List<String>> places;
	
	public RingingCenter() {
		places = new HashMap<>();
	}
	
	public void observe(Bird bird, String place) {
		if (places.containsKey(bird))
			places.get(bird).add(place);
		else
			places.put(bird, new ArrayList<String>(Arrays.asList(place)));
	}
	
	public void observations(Bird bird) {
		if (places.containsKey(bird)) {
			System.out.println(bird + " observations: " + places.get(bird).size());
			for (String place : places.get(bird))
				System.out.println(place);
		} else {
			System.out.println(bird + " observations: 0");
		}
	}
}
