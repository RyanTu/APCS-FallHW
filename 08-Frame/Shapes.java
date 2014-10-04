public class Shapes{
    // frame: 15 min
    public String frame(int r, int c){
	String s = "";
	int row,col;
	for (row = 0; row < r; row++){
	    for (col = 0; col < c; col++){
		if (row == 0 || row == r - 1){
		    s = s + "*";
		} else if (col == 0 || col == c - 1){
		    s = s + "*";
		} else
		    s = s + " ";
	    }
	    s = s + "\n";
	}
	return s;
    }

    // stringSplosion: 5 min
    public String stringSplosion(String str){
	String s = "";
	int len = str.length();
	while (len >= 0){
	    s = str.substring(0,len) + s;
	    len = len - 1;
	}
	return s;
    }

    // stringX: 15 min
    public String stringX(String str){
	String s = "";
	int i = 0;
	int len = str.length();
        while(i<len){
	    String letter = str.substring(i,i+1);
	    if (i == 0 || i == len - 1){
		s = s + letter;
	    } else if (letter.equals("x")){
		s = s;
	    } else
		s = s + letter;
	    i++;
	}
	return s;
    }
}
