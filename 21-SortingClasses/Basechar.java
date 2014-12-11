public class Basechar implements Comparable {
    private int health=20;
    private String name="";

    public Basechar(String n) {
	setName(n);
    }
    
    public String toString(){
	return this.getName();
    }
    
    public void attack(Basechar other){
	System.out.println(this+" is attacking "+other);

    }
    
    public void setName(String name){
	this.name = name;
    }
    
    public String getName(){
	return this.name;
    }

    public int getHealth() {
	return this.health;
    }

}
