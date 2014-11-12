public class Sarray {
    int[] data;
    int[] some = {1,2,3,4};
    int   last;
    int len;

    
    public Sarray(){
	data = some;
	len = data.length;
    }

    public Sarray(int[] d) {
        // set up the initial instance variables
	data = d;
	len = data.length;
    }

    public boolean add(int i){
        // adds an item to the end of the list, grow if needed
        // returns true
	int[] newA = new int[len+1];
	for (int j = 0; j<len+1; j++){
	    if (j<len && data[j] != 0){
		newA[j] = data[j];
	    } if (j==len){
		newA[len] = i;
	    }
	}
	data = newA;
	return true;
    }

    public void  add(int index, int i){
        // adds item i  at index, shifting everything down as needed.
        // also grows as needed 

	if (index > len-1){
	    throw new IndexOutOfBoundsException();
	}
	int[] newA = new int[len];
	for (int j = len-1; j>-1; j--){
	    if (j>index && data[j] != 0){
		newA[j+1] = data[j];
	    } else if (j == index){
		newA[j] = i;
	    } else 
		newA[j] = data[j];
	}
	data = newA;
    }

    public int size() {
        // returns the number of items in the list (not the array size)
	int s = 0;
	for (int i = 0; i<len; i++){
	    if (data[i] != 0){
		s++;
	    }
	}
	return s;
    }

    public int get(int index) {
        // returns the item at location index of the lsit
	return data[index];
    }

    public int set(int index, int i){
        // sets the item at location index to value i
        // returns the old value. 
        last = get(index);
	data[index] = i;
	return last;
    }

    public int remove(int index){
        // removes the item at index i
        // returns the old value
	int ans = get(index);
	int[] newA = new int[len-1];
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

    public static void main(String[] args){
	Sarray s = new Sarray();
        try{
	    System.out.println(s.remove(1));
	} catch (IndexOutOfBoundsException e){
	    System.out.println("Use another index");
	}
    }
}
