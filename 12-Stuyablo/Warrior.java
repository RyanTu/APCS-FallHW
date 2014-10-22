public class Warrior extends BaseChar {
    private int healthboost = 5;
    private int strengthboost = 5;
    
    
    public int getHealth() {
	return (healthboost + super.getHealth());
    }
    public int getMana() {
	return super.getMana();
    }
    public int getAttack() {
	return (strengthboost + super.getAttack());
    }
    public int getDexterity() {
	return super.getDexterity();
    }
    public void attack(BaseChar other){
	System.out.println(this+" is SUPERattacking "+other);
    }
}
