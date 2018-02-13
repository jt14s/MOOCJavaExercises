package exercise24;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

	private Map<String, Set<String>> translations;
	
	public PersonalMultipleEntryDictionary() {
		translations = new HashMap<>();
	}
	
	@Override
	public void add(String word, String translation) {
		if (translations.containsKey(word))
			translations.get(word).add(translation);
		else
			translations.put(word, new HashSet<>(Arrays.asList(translation)));
	}

	@Override
	public Set<String> translate(String word) {
		return translations.get(word);
	}

	@Override
	public void remove(String word) {
		if (translations.containsKey(word))
			translations.remove(word);
	}
}
