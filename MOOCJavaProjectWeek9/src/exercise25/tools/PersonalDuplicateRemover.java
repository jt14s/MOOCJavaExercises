package exercise25.tools;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {

	private Map<String, Integer> words;
	
	public PersonalDuplicateRemover() {
		words = new HashMap<>();
	}
	
	@Override
	public void add(String characterString) {
		if (words.containsKey(characterString))
			words.put(characterString, 1);
		else
			words.put(characterString, 0);
	}

	@Override
	public int getNumberOfDetectedDuplicates() {
		int dupCount = 0;
		
		for (String word : words.keySet())
			if (words.get(word) > 0)
				dupCount += 1;
		
		return dupCount;
	}

	@Override
	public Set<String> getUniqueCharacterStrings() {
		Set<String> uniques = new HashSet<>();

		for (String word : words.keySet())
				uniques.add(word);
		
		return uniques;
	}

	@Override
	public void empty() {
		words.clear();
	}
}
