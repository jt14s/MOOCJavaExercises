package exercise45;

import exercise45.personnel.Education;
import exercise45.personnel.Employees;
import exercise45.personnel.Person;

class Main {

	public static void main(String[] args) {
		Employees university = new Employees();
        university.add(new Person("Matti", Education.D));
        university.add(new Person("Pekka", Education.GRAD));
        university.add(new Person("Arto", Education.D));

        university.print();

        university.fire(Education.GRAD);

        System.out.println("==");

        university.print();
	}
}
