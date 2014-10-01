public class WhileStuff{
    // frontTimes: 5 min
    public String frontTimes(String str, int n) {
	String ans = "";
	String front = "";
	if (str.length() < 3){
	    front = str;
	} else 
	    front = str.substring(0,3);
	while (n > 0){
	    ans = ans + front;
	    n = n - 1;
	}
	return ans;
    }

    // stringBits: 10 min
    public String stringBits(String str) {
	int n = 0;
	int len = str.length();
	String ans = "";
	while (len > n){
	    if (len % 2 == 0 && (len - n) % 2 == 0){
		ans = ans + str.substring(n,n+1);
	    } else if (len % 2 == 1 && (len - n) % 2 ==1){
		ans = ans + str.substring(n,n+1);
	    }
	    n = n + 1;
	}
	return ans;
    }

    // stringYak: 15 min
    public String stringYak(String str) {
	while (str.indexOf("yak") != -1){
	    int temp = str.indexOf("yak");
	    str = str.substring(0,temp) + str.substring(temp + 3);
	}
	return str;
    }

    // stringMatch: 15 min
    public int stringMatch(String a, String b) {
	int ans = 0;
	int n = 0;
	String list = "";
	while (n < a.length() - 1 && a.length() != 0 && n < b.length() - 1 && b.length() != 0){
	    String tempA = a.substring(n,n+2);
	    String tempB = b.substring(n,n+2);
	    if (tempA.equals(tempB)){
		ans = ans + 1;
	    }
	    n = n + 1;
	}
	return ans;
    }
}
