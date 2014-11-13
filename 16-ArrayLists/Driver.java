import java.util.*;

public class Driver{
    public static void main(String[] args){

	ArrayList<Integer> ai = new ArrayList<Integer>();

	Random r = new Random();
	for (int i = 0; i<20; i++){
	    ai.add(r.nextInt(5));
	}

	// System.out.println(ai);

	int temp = ai.get(0);
	int i = 1;
	while (i<ai.size()){
	    if (temp == ai.get(i)){
		temp = ai.remove(i);
	    } else {
		temp = ai.get(i);
		i++;
	    }
	}

	// System.out.println(ai);
    }
}
