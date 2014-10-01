public class Driver{
    public static void main(String[] args){
	WhileStuff w = new WhileStuff();

	// frontTimes: returns "ChoCho"
	System.out.println(w.frontTimes("Chocolate", 2));

	// stringBits: returns "Hlo"
	System.out.println(w.stringBits("Hello"));

	// stringYak: returns "pak"
	System.out.println(w.stringYak("yakpak"));

	// stringMatch: returns 3
	System.out.println(w.stringMatch("xxcaazz", "xxbaaz"));
    }
}
