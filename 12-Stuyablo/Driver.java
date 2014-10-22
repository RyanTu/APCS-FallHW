import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args){
	
	
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String n = sc.nextLine();	       
	
	Scanner sc2 = new Scanner(System.in);
	String c = "";
	BaseChar p = new BaseChar();
	while (!(c.toLowerCase().equals("warrior") || c.toLowerCase().equals("mage"))){
	    System.out.println("Are you a Warrior or a Mage?");
	    c = sc2.nextLine();
	}
	
	
	System.out.println("Greetings, "+ n + " the " + c.substring(0,1).toUpperCase() + c.substring(1).toLowerCase());
	
	String w = "";
	c = c.toLowerCase();
        if (c.equals("warrior")){
	    w = "sword";
	} else {
	    w = "staff";
	}
	
	
	try{
	    Thread.sleep(1000);
	} catch (Exception e) {}
	System.out.println("You wake up");
	try{
	    Thread.sleep(1000);
	} catch (Exception e) {}
	System.out.println("The darkness is overwhelming, but you grab a nearby branch and bring yourself to your feet");
	try{
	    Thread.sleep(3000);
	} catch (Exception e) {}
	System.out.println("You try to recall your name, but it won't come");
	try{
	    Thread.sleep(3000);
	} catch (Exception e) {}
	System.out.println("Deep gutteral growls come from all sides");
	try{
	    Thread.sleep(3000);
	} catch (Exception e) {}
	System.out.println("You find a " + w + " laying beside you");
	try{
	    Thread.sleep(3000);
	} catch (Exception e) {}
	System.out.println("Survival is the only option...");
	try{
	    Thread.sleep(2000);
	} catch (Exception e) {}
	System.out.println("You can go forward or backward. Where would you like to go?");
	
	if (c.equals("warrior")){
	    p = new Warrior();
	    
	} else {
	    p = new Mage();
	}
	int h = p.getHealth();
	int m = p.getMana();
	int att = p.getAttack();
	BaseMonster v = new BaseMonster();
	int mh = v.getHealth();
	
	String d = "";
	while (!(d.toLowerCase().equals("forward") || d.toLowerCase().equals("backward"))){
	    d = sc2.nextLine();
	    }
	
	System.out.println("You went "+d+". All of a sudden, a huge scary monster appears before you");
	
	String a = "";
	while ((h >= 0)&& (mh >= 0)){
	    int random = (int )(Math.random() * 6 + 1);
	    System.out.println("Would you like to attack the monster or flee from it? ");
	    a = sc2.nextLine();
	    if (a.equals("flee")){
		System.out.println("You fled from the monster. Coward.");
		System.exit(0);
	    }
	    if (a.equals("attack")){
		if (c.equals("mage")){
		    System.out.println("You bravely cast a fireball on the monster");
		    m=m-2;
		    mh=mh-(30*random);
		    System.out.println("The monster viciously claws you in retaliation!");
		    h=h-(random*15);
		    System.out.println("Your Health: "+h+" Monster's Health: "+mh);
		}
		if (c.equals("warrior")){
		    System.out.println("You bravely slash the monster");
		    m=m-2;
		    mh=mh-(att*random);
		    System.out.println("The monster viciously claws you in retaliation!");
		    h=h-(random*10);
		    System.out.println("Your Health: "+h+" Monster's Health: "+mh);
		}
		if (h>0&&mh<=0){
		    System.out.println("CONGRATULATIONS " + n + " the " + c.substring(0,1).toUpperCase() + c.substring(1).toLowerCase());
		    System.out.println("You have defeated the evil monster. We hope you enjoyed this fun little game");
		    System.exit(0);
		} 
		if (mh>0&&h<=0){
		    System.out.println("You are now a tasty snack. Goodbye");
		    System.exit(0);
		}
		if (mh<=0&&h<0){
		    System.out.println("You kill the monster as you take your dying breath.");
		    System.exit(0);
		}	
	    }
	}
    }
}
