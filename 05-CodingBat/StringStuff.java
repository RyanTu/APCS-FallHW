public class StringStuff{
    // nonStart
    public String nonStart(String a, String b) {
	String newA = a.substring(1);
	String newB = b.substring(1);
	return newA + newB;
    }

    // makeABBA
    public String makeAbba(String a, String b) {
	return a + b + b + a;
    }

    // diff21
    public int diff21(int n) {
	if (n <= 21){
	    return (21 - n);
	} else{
	    return -2 * (21 - n);
	}   
    }

}
