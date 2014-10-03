
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

    /* HW 07b begins*/
    // tri3: 8 min
    public String tri3(int h){
	String s = "";
	int row, sp, st;
	for (row = 1; row <= h; row++){
	    for (sp = h - row; sp > 0; sp--){
		s = s + " ";
	    }
	    for (st = 2*row-1; st > 0; st--){
		s = s + "*";
	    }
	    s = s + "\n";
	}
	return s;
    }

    // diamond: 35 min, problem: spacing with even numbers around h/2
    public String diamond (int h){
	String s = "";
	int row, sp, st;
	for (row = 0; row < (h/2.0); row++){
	    for (sp = (h/2) - row; sp > 0; sp--){
		s = s + " ";
	    }
	    for (st = 2*row+1; st > 0; st--){
		s = s + "*";
	    }
	    s = s + "\n";
	}
	while (row < h){
	    for (sp = row - (h/2); sp > 0; sp--){
		s = s + " ";
	    }
	    for (st = 2*(h-row)-1; st > 0; st--){
		s = s + "*";
	    }
	    s = s + "\n";
	    row = row + 1;
	}
	return s;
    }

    // tri4: 5 min
    public String tri4(int h){
	String s = "";
	int row, sp, st;
	row = h;
	while (row > 0){
	    for (sp = 0; sp <= (h-row); sp++){
		s = s + " ";
	    }
	    for (st = row; st > 0; st--){
		s = s + "*";
	    }
	    s = s + "\n";
	    row--;
	}
	return s;
    }
}


