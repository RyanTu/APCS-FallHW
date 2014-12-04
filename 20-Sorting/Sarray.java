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
	int last = 1;
	while (last<data.length){
	    int i = last;
	    String newvalue = data[i];
	    while(i > 0 && newvalue.compareTo(data[i-1])<0) {
		data[i] = data[i-1];    
		i--;
	    }
	    data[i] = newvalue;
	    last++;
	    i = last;
	}
    }

    public void ssort(){
	for (int reset = 0; reset<data.length-1; reset++){
	    String min = data[reset];
	    int minIndex = 0;
	    int i = reset + 1;
	    while (i<data.length){
		if (min.compareTo(data[i])>0){
		    min = data[i];
		    System.out.println("|" + min);
		    minIndex = i;
		}
		i++;
	    }
	    String temp = data[reset];
	    data[reset] = min;
	    System.out.println("||" + data[reset]);
	    data[minIndex] = temp;
	    System.out.println(toString());
	}
    }

    public static void main(String[] args){
	String[] stuff = {"stuff","new","other","what","blah","creative","not"};
	Sarray s = new Sarray(stuff);
	OrderedSarray os = new OrderedSarray(stuff);
        try{
	    System.out.println(s.toString());
	    s.ssort();
	    System.out.println(s.toString());
	} catch (IndexOutOfBoundsException e){
	    System.out.println("Use another index");
	}
    }
}
