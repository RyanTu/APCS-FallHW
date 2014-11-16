import java.util.*;

public class RandomAL{
    ArrayList<Integer> al = new ArrayList<Integer>();
    public RandomAL(int n){
	for (int i = 0; i<n; i++){
	    al.add(i);
	}
    }
    public RandomAL(){
	this(10);
    }

    Random r = new Random();

    public ArrayList<Integer> rand(){
	ArrayList<Integer> temp = new ArrayList<Integer>();
	int index;
	while (al.size()>0){
	    index = r.nextInt(al.size());
	    temp.add(al.get(index));
	    al.remove(index);
	}
	al = temp;
	return al;
    }
}
