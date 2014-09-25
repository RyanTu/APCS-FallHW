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

    /*working*/
    public boolean nearHundred(int n) {
	return (Math.abs(100 - n) <= 10 || Math.abs(200-n) <= 10);
    }

    /*working*/
    public boolean mixStart(String str) {
	if (str.length() < 3){
	    return false;
	}
	String check = str.substring(1,3);
	return check.equals("ix");
    }

    /*working*/
    public int teaParty(int tea, int candy) {
	if (tea < 5 || candy < 5){
	    return 0;
	} else if (tea >= candy * 2 || candy >= tea * 2){
	    return 2;
	} else
	    return 1; 
    }

    /*working*/
    public boolean lastDigit(int a, int b, int c) {
	a = a % 10;
	b = b % 10;
	c = c % 10;
	return (a == b) || (a == c) || (b == c);
    }
}
