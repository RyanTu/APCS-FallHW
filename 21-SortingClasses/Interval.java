import java.io.*;
import java.util.*;

public class Interval{
    
    private static Random r = new Random();
    private int low, high;

    private void setup(int l, int h){
	high = h;
	low = l;
    }
    
    public Interval(){
        int h = r.nextInt(100) + 1;
	int l = r.nextInt(h);
	setup(l,h);
    }
    
    public Interval(int l, int h){
	setup(l,h);
    }

    public String toString(){
	String s = "[" + low + "," + high + "]";
	return s;
    }

    public int getLow(){
	return low;
    }

    public int getHigh(){
	return high;
    }

    public int compareTo(Interval other){
	if (this.getLow() != other.getLow()){
	    return this.getLow()-other.getLow();
	} else {
	    return this.getHigh() - other.getHigh();
	}
    }

    public static void main(String[] args){
	/*
	for (int i = 0; i<10; i++){
	    System.out.println(new Interval());
	}

	Interval[] a = new Interval[10];
	for (int i = 0; i<a.length; i++){
	    a[i] = new Interval();

	}
	System.out.println(Arrays.toString(a));
	*/
	Interval i1 = new Interval(9, 12);
	Interval i2 = new Interval(9, 12);
	System.out.println(i1.compareTo(i2));
    }
}
