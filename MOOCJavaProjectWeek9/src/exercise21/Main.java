package exercise21;

class Main {

	public static void main(String[] args) {
		Printer printer = new Printer("src/exercise21/textfile.txt");

	    printer.printLinesWhichContain("Väinämöinen");
	    System.out.println("-----");
	    printer.printLinesWhichContain("Frank Zappa");
	    System.out.println("-----");
	    printer.printLinesWhichContain("");
	    System.out.println("-----");
	}
}
