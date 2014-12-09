import java.io.*;
import java.util.*;

public class Sarray {
    String[] data;
    String   last;
    int len;

    
    public Sarray(){
	String[] temp = {"some","thing","else"};
	data = temp;
	len = data.length;
    }

    public Sarray(String[] d) {
        // set up the initial instance variables
	data = d;
	len = data.length;
    }

    public String toString(){
	String blah = "";
	for (int i = 0; i<data.length; i++){
	    blah += data[i] + " ";
	}
	return blah;
    }
    
    public boolean add(String i){
        // adds an item to the end of the list, grow if needed
        // returns true
	String[] newA = new String[len+1];
	for (int j = 0; j<len+1; j++){
	    if (j<len && data[j] != null){
		newA[j] = data[j];
	    }
	    if (j==len){
		newA[len] = i;
	    }
	}
	data = newA;
	return true;
    }

    public void add(int index, String i){
        // adds item i  at index, shifting everything down as needed.
        // also grows as needed 

	if (index > len-1){
	    throw new IndexOutOfBoundsException();
	}
	String[] newA = new String[len+1];
	for (int j = len-1; j>-1; j--){
	    if (j>index){
		newA[j+1] = data[j];
	    } else if (j == index){
		newA[j+1] = data[j];
		newA[j] = i;
	    } else
		newA[j] = data[j];
	}
	data = newA;
    }

    public int size() {
        // returns the number of items in the list (not the array size)
	int s = 0;
	for (int i = 0; i<data.length; i++){
	    s++;
	}
	return s;
    }

    public String get(int index) {
        // returns the item at location index of the lsit
	return data[index];
    }

    public String set(int index, String i){
        // sets the item at location index to value i
        // returns the old value. 
        last = get(index);
	data[index] = i;
	return last;
    }

    public String remove(int index){
        // removes the item at index i
        // returns the old value
        String ans = get(index);
	String[] newA = new String[len-1];
	for (int i = 0; i<newA.length-1; i++){
	    if (i>=index){
		newA[i] = data[i+1];
	    } else {
		newA[i] = data[i];
	    }
	}
	data = newA;
	return ans;
    }

    public void isort(){
	  int counter = 1;
	int last = 1;
	while (last<data.length){
	    int i = last;
	    String newvalue = data[i];
	      counter+=2;
	    while(i > 0 && newvalue.compareTo(data[i-1])<0) {
		data[i] = data[i-1];    
		i--;
		  counter+=2;
	    }
	    data[i] = newvalue;
	    last++;
	    i = last;
	      counter+=3;
	}
	  System.out.println(counter);
    }

    public void ssort(){
	int counter = 1;
	for (int current = 0; current<data.length; current++){
	    int test = current+1;
	    int minIndex = current;
	    String min = data[current];
	      counter+=3;
	    while (test+1<data.length){
		if (data[test].compareTo(data[test+1])>0){
		    min = data[test+1];
		    minIndex = test+1;
		      counter+=2;
		}
		test++;
		  counter+=1;
	    }
	    String temp = data[current];
	    data[current] = min;
	    data[minIndex] = temp;
	      counter+=3;
	}
	  System.out.println(counter);
    }

    public void bsort(){
	boolean inOrder = false;
	int count = 0;
	int counter = 2;
	for (int i = 0; !inOrder; i++){
	    if (data[i].compareTo(data[i+1])>0){
		String temp = data[i];
		data[i] = data[i+1];
		data[i+1] = temp;
		count = 0;
		counter += 4;
	    } else {
		count++;
		counter += 1;
	    }
	    if (count == data.length-1){
		inOrder = true;
		counter += 1;
	    }
	    if (i == data.length-2){
		i = -1;
		counter += 1;
	    }
	    counter += 1;
	}
	System.out.println(counter);
    }

    public void builtin(){
	Arrays.sort(data);

    }

    public static void main(String[] args){
	String[] stuff = {"stuff","new","other","what","blah","creative","not"};
	Sarray s = new Sarray(stuff);
	OrderedSarray os = new OrderedSarray(stuff);
	try{
	      System.out.println(s.toString());
	      s.builtin();
	      System.out.println(s.toString());
	} catch (IndexOutOfBoundsException e){
	    System.out.println("Use another index");
	}
    }
}
