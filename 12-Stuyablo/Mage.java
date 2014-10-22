public class Mage extends BaseChar {
    private int manaboost = 5;
    
    
    public int getHealth() {
	return super.getHealth();
    }
    public int getMana() {
	return manaboost + super.getMana();
    }
    public int getAttack() {
	return super.getAttack();
    }
    public int getDexterity() {
	return super.getDexterity();
    }
    public void attack(BaseChar other){
	System.out.println(this+" is casting on "+other);
    }
}
