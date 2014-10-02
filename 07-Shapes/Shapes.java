
public class Shapes {
    public String box(int r, int c) {
	String s = "";

	while (r>0){
	    int cc = 0;
	    while (cc < c){
		s += "*";
		cc += 1;
	    }
	    s = s + "\n";
	    r--;
	}

	return s;
    }

    // tri1: about 10 min
    public String tri1(int h){
	String s = "";
	int r = 1;
	int c = 1;
	while (c <= h){
	    while (r > 0){
		s = s + "*";
		r = r - 1;
	    }
	    c = c + 1;
	    r = c;
	    s = s + "\n";
	}
	return s;
    }

    // tri2: about 8 min
    public String tri2(int h){
	String s = "";
	int c = 1;
	int r = 1;
	int blank = h - r;
	while (c <= h){
	    while (r > 0){
		while (blank > 0){
		    s = s + " ";
		    blank = blank - 1;
		}
		s = s + "*";
		r = r - 1;
	    }
	    c = c + 1;
	    r = c;
	    blank = h - r;
	    s = s + "\n";
	}
	return s;
    }
}


