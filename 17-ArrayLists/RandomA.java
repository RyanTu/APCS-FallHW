import java.util.*;

public class RandomA{
    int[] a;
    public RandomA(int n){
	a = new int[n];
	for (int i = 0; i<a.length; i++){
	    a[i] = i;
	}
    } 
    public RandomA(){
	this(10);
    }

    Random r = new Random();
    public void rand(){
	for (int i = 0; i<a.length; i++){
	int r1 = r.nextInt(a.length);
	int r2 = r.nextInt(a.length);
	int store = a[r1];
	a[r1] = a[r2];
	a[r2] = store;
	}
    }
}
