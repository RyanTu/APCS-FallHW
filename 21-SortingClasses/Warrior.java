import java.util.*;
import java.io.*;

public class Warrior extends Basechar{
    private int healthboost = 5;

    public Warrior() {
	super("DEFAULT");
    }
    public Warrior(String n) {
	super(n);
    }
    

    public int getHealth() {
	return healthboost + super.getHealth();
    }
    public void attack(Basechar other){
	System.out.println(this+" is SUPERattacking "+other);

    }

    public int compareTo(Object other){
        Warrior b = (Warrior)other;
	//Sorts by length of name
	return this.toString().length() - other.toString().length();
    }

    public static void main(String args[]){
        String[] list = {"doggy","cat","woof"};
	Warrior[] w = new Warrior[list.length];
	for (int i = 0; i<list.length; i++){
	    w[i] = new Warrior(list[i]);
	}
	System.out.println(Arrays.toString(w));
	Arrays.sort(w);
	System.out.println(Arrays.toString(w));
    }
    
}
