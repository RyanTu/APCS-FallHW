public class Driver {
    public static void main(String[] args){
	Basechar c = new Basechar();
	Warrior w = new Warrior();
	Mage m = new Mage();

	System.out.println(c.getHealth());
	System.out.println(w.getHealth());
	System.out.println(m.getHealth());

	System.out.println(m.getManna());

	Basechar b1,b2;
	Warrior w1,w2;
	Mage m1,m2;

	b1 = new Basechar();
	w1 = new Warrior();
	m1 = new Mage();

	m2 = m1;
	/* m2 is a variable that directs to Mage@___ (same as m1)*/
	// m2 = b1;
	// incompatible types required: Mage found: Basechar
	// m2 = c1;
	// cannot find c

	b2 = m1;
	/* b2 directs to Mage@___ (same as m1), no access to getManna */
	b2 = m2;
	/* b2 directs to Mage@___ (same as m2), no access to getManna */
	b2 = new Warrior();
	/* b2 directs to Warrior@___, no access to healthboost */
    }

}
