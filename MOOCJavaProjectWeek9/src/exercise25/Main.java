package exercise25;

import exercise25.tools.DuplicateRemover;
import exercise25.tools.PersonalDuplicateRemover;

class Main {

	public static void main(String[] args) {
		DuplicateRemover remover = new PersonalDuplicateRemover();
        remover.add("first");
        remover.add("second");
        remover.add("first");

        System.out.println("Current number of duplicates: " +
            remover.getNumberOfDetectedDuplicates());

        remover.add("last");
        remover.add("last");
        remover.add("new");

        System.out.println("Current number of duplicates: " +
            remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique characterStrings: " +
            remover.getUniqueCharacterStrings());

        remover.empty();

        System.out.println("Current number of duplicates: " +
            remover.getNumberOfDetectedDuplicates());

        System.out.println("Unique characterStrings: " +
            remover.getUniqueCharacterStrings());
	}
}
