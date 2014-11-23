import java.util.*;

public class WordSearch {
    private char[][] board;
    private int boardX;
    private int boardY;
    
    public WordSearch(int r, int c){
	boardX = r;
	boardY = c;
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
    }

    public WordSearch() {
	this(20,40);
    }

    Random r = new Random();

    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public boolean noOverlap(String w, int x, int y, int xVel, int yVel){
	int l = w.length();
	if((x+l*xVel<0)||(x+l*xVel>=boardX)||
	   (y+l*yVel<0)||(y+l*yVel>=boardY)){
	    return false;
	}
	for (int i = 0; i<w.length(); i++){
	    if (board[x][y] != '.'){
		if (board[x][y] != w.charAt(i)){
		return false;
		}
	    }
	    x += xVel;
	    y += yVel;
	}
	return true;
    }

    public boolean addWord(String w){
	int l = w.length()-1;
	boolean fits = false;
	int failCount = 0;
	while(!fits){
	    int x = r.nextInt(boardX);
	    int y = r.nextInt(boardY);
	    int xVel=0;
	    int yVel=0;

	    while(xVel==0 && yVel==0){
		xVel = r.nextInt(3) - 1;
		yVel = r.nextInt(3) - 1;
	    }
	   
	    if (noOverlap(w,x,y,xVel,yVel)){
		for (int i = 0; i<=l; i++){
		    board[x][y] = w.charAt(i);
		    x += xVel;
		    y += yVel;
		}
		fits = true;
	    } else if (failCount>10){
	        System.out.println(w + " did not fit.");
		return false;
	    } else{
		xVel = 0;
		yVel = 0;
		failCount += 1;
	    }	    
	}
        return true;
    }    
}

