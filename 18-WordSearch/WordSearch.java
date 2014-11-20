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

    public void addWord(String w){
	int l = w.length()-1;
	boolean fits = false;
	while(!fits){
	    int y = r.nextInt(boardX);
	    int x = r.nextInt(boardY);
	    int xVel=0;
	    int yVel=0;
	    while(xVel==0 && yVel==0){
		// xVel = r.nextInt(3) - 1;
		yVel = r.nextInt(3) - 1;
	    }
	    if((x+l*xVel>=0)&&(x+l*xVel<boardX)&&
	       (y+l*yVel>=0)&&(y+l*yVel<boardY)){
		for (int i = 0; i<w.length(); i++){
		    board[x][y] = w.charAt(i);
		    y += 1*yVel;
		    // y += 1*yVel;
		}
		fits = true;
	    }
	}
    }
}
