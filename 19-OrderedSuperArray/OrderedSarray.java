public class OrderedSarray extends Sarray{

    public OrderedSarray(){
	super();
    }

    public OrderedSarray(String[] d){
	super(d);
    }
    
    public boolean add(String s){
	boolean added = false;
	String[] temp = new String[super.data.length+1];
	for (int i = 0; i<super.data.length; i++){
	    if (s.compareTo(super.data[i])<0 && added == false){
		temp[i] = s;
		i--;
		added = true;
	    } else if (added == false){
		if (i == super.data.length-1){
		    temp[i+1] = s;
		} 
		temp[i] = super.data[i];
	    } else {
		temp[i+1] = super.data[i];
	    }
	}
        super.data = temp;
	return true;
    }

    public void add(int i, String s){
	add(s);
	System.out.println("OrderedSarray will use the index based on order.");
    }

    public String set(int index, String s){
	boolean added = false;
	String[] temp = new String[super.data.length];
	for (int i = 0; i<super.data.length; i++){
	    String blah = "";
	    if (s.compareTo(super.data[i])<0 && added == false){
		blah = data[i];
		temp[i] = s;
		added = true;
	    } else {
		temp[i] = super.data[i];
	    }
	}
        super.data = temp;
	return blah;
    }
}
