package exercise4;

class Main {
	public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 0; i < 100; ++i) {
        	Suitcase brickSuitcase = new Suitcase(1000);
        	brickSuitcase.addThing(new Thing("Suitcase", i + 1));
        	container.addSuitcase(brickSuitcase);
        }
    }
}
