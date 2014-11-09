public class Sarray {
    int[] data;
    int   last;
    int len = data.length;

    public Sarray(){
	int[] data = {1,2,3,4,5,6,7};
    }

    public Sarray(int[] d) {
        // set up the initial instance variables
	data = d;
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
	int[] newA;
	if (data[len-1] != 0){ 
	    newA = new int[len+1];
	} else{ 
	    newA = new int[len];
	}

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
	for (int i = 0; i<len-1; i++){
	    if (i>=index){
		data[i] = data[i+1];
	    }
	}
	return ans;
    }
}
