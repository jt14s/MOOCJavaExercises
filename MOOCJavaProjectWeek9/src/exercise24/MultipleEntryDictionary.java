package exercise24;

import java.util.Set;

interface MultipleEntryDictionary {

	void add(String word, String translation);
    Set<String> translate(String word);
    void remove(String word);
}
