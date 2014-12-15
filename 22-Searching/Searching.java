import java.util.*;
import java.io.*;

public class Searching{

    Comparable[] data;
    
    public Searching(){
	this(10);
    }
    public Searching(int n){
        data = new Comparable[n];
	// data = new Comparable[] {7,8,1,1,2,8,1,0,9,1};
	// data = new Comparable[] {6,2,4,2,4,7,3,7,3,1};
    }
    
    public String toString(){
	String blah = "";
	for (int i = 0; i<data.length; i++){
	    blah += data[i] + " ";
	}
	return blah;
    }

    public void addItem(int n){
	boolean added = false;
	int i = 0;
	while(i<data.length && !added){
	    if (data[i]!=(null)){
		i++;
	    } else {
	        added = true;
	    } 
	}
	if (added == true){
	    Comparable[] temp = data;
	    temp[i] = n;
	    data = temp;
	}
        else{
	    Comparable[] temp = new Comparable[data.length+1];
	    for (int j = 0; j<data.length; j++){
		temp[j] = data[j];
	    }
	    temp[i] = n;
	    data = temp;
	}
    }

    public void sorter(){
	Arrays.sort(data);
    }

    public Comparable lsearch(Comparable item){
	for (int i = 0; i<data.length; i++){
	    if (data[i].equals(item)){
		return item;
	    }
	}
	return null;
    }

    public Comparable bsearch(Comparable item){
	sorter();
	int high = data.length-1;
	int low = 0;
	int doubled = 0;
	while (high-low >= 0 && doubled<2){
	    int c = item.compareTo(data[(high+low)/2]);
	    int tempLow = low;
	    int tempHigh = high;
	    if (high-low == 0){
		doubled++;
	    }
	    if (c==0){
		return item;
	    }
	    else if (c>0){
		low = (low+high)/2;
		if (tempLow == low){
		    doubled++;
		}
	    }
	    else if (c<0){
		high = (low+high)/2;
		if (tempHigh == high){
		    doubled++;
		}
	    }
	}
	return null;
    }
    public Comparable rbsearch(Comparable item){
	sorter();
	return rbsearch(item,0,data.length-1, 0);
    }

    public Comparable rbsearch(Comparable item, int low, int high, int r){
	while(high-low>=0 && r<2 && (low+high/2)<data.length){
	    int tempLow = low;
	    int tempHigh = high;
	    int c = item.compareTo(data[low+high/2]);
	    if (c == 0){
		return item;
	    }
	    else if (c>0){
		low = (low + high)/2;
		if (tempLow == low){
		    r++;
		}
	    } 
	    else if (c<0){
		high = (low + high)/2;
		if (tempHigh == high){
		    r++;
		}
	    }
	    rbsearch(item,low,high,r);
	}
	return null;
    }

    public static void main(String[] args){
	Random r = new Random();
	Searching s = new Searching();
	
	for (int i = 0; i<10; i++){
	    s.addItem(r.nextInt(10));
	}
	
	System.out.println(s.toString());
	System.out.println(s.lsearch(9));
	System.out.println(s.bsearch(9));
	System.out.println(s.rbsearch(9));

    }
}
