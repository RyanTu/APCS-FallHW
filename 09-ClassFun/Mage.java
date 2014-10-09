public class Mage extends Basechar{
    private int manna =12345;
    private String name;

    public Mage(String s){
	name = s;
    }

    public Mage(){
	name = "Generic";
    }

    public Mage(String n, int m){
	name = n;
	manna = m;
    }

    public int getManna(){
	return manna;
    }

    public String getName(){
	return name;
    }
    
}
