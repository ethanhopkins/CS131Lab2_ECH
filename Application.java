/**
 * Application class for Wizard
 * @author rkelley
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wizard w1 = new Wizard("Gandel");
		w1.setHealth(11);
		w1.setKey(4);
		w1.setName("Gandalf");
		
		w1.unlock(7);
		w1.takeDamage(3);
		
		w1.lock(4);
		w1.takeDamage(3);
	}

}
