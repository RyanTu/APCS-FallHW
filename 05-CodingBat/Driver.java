public class Driver{
    public static void main(String[] args){
	StringStuff a = new StringStuff();

	// nonStart test: returns ellohere
	System.out.println(a.nonStart("Hello","There"));

	// makeABBA test: returns HiByeByeHi
	System.out.println(a.makeAbba("Hi","Bye"));

	// diff21 test: n <= 21
	System.out.println(a.diff21(19)); //returns 2
	// diff21 test: n > 21
	System.out.println(a.diff21(50)); //returns 58
    }
}

