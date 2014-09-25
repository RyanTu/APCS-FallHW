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

	// nearHundred tests
	System.out.println(a.nearHundred(90)); //returns true
	System.out.println(a.nearHundred(89)); //returns false
	System.out.println(a.nearHundred(210)); //returns true
	System.out.println(a.nearHundred(211)); //return false

	// mixStart tests
	System.out.println(a.mixStart("mix snacks")); //returns true
	System.out.println(a.mixStart("piz snacks")); //returns false
	System.out.println(a.mixStart("ni")); //returns false

	// teaParty tests
	System.out.println(a.teaParty(3,8)); //returns 0
	System.out.println(a.teaParty(5,10)); //returns 2
	System.out.println(a.teaParty(11,6)); //returns 1

	// lastDigit tests
	System.out.println(a.lastDigit(23,19,13)); //returns true
	System.out.println(a.lastDigit(23,19,12)); //returns false
    }
}

