/**
 * This class represents a wizard for
 * a D&D type game.
 * @author rkelley
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */

public class Wizard implements Lockable{
	
	private String name;
	private int health;
	private int key;
	boolean locked;
	
	
	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() {
	
	}//end constructor
	
	
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	public Wizard(String name) {
		setName("");
		setHealth(0);
		key = 0;
		locked = false;
	}//end constructor
	
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	public void takeDamage(int power) {
		if (isLocked() == true) {
			health = health - 0;
			System.out.println(health);
		} else {
			health = health - power;
			System.out.println(health);
		}
	}//end takeDamage
	
	
	/**
	 * lock method
	 * will set the value of locked to true if the value of key is the same as the initial value
	 * @param int key
	 */
	public void lock(int key) {
		if (key == this.key) {
			locked = true;
		}
	}
	//end method
	
	
	/**
	 * unlock method
	 * will set the value of locked to false if the value of key is the same as the initial value
	 * @param int key
	 */
	public void unlock(int key) {
		if (key == this.key) {
			locked = false;
		}
	}
	//end method
	
	
	/**
	 * getter for locked
	 * returns the value of locked
	 */
	public boolean isLocked() {
		return locked;
	}
	//end getter
	
	
	/**
	 * Getter for name
	 * @return name
	 */
	public String getName() {
		return name;
	}//end getName
	
	
	/**
	 * Setter for name
	 * @param newName
	 */
	public void setName(String newName) {
		name = newName;
	}//end setName
	
	
	/**
	 * Getter for health
	 * @return health
	 */
	public int getHealth() {
		return health;
	}//end getHealth
	
	
	/**
	 * Setter for health
	 * @param health
	 */
	public void setHealth(int newHealth) {
		health = newHealth;
	}//end setHealth
	
	
	/**
	 * Getter for the key
	 * @return key
	 */
	public int getKey() {
		return key;
	}//end getKey
	

	/**
	 * setter for key
	 * will set a new value for key if it is greater than 0 and key hasnt already been set
	 * @param newKey
	 */
	public void setKey(int newKey) {
		if (newKey > 0 && this.key == 0) {
			key = newKey;
		}
	}
	//end setter
	
	
	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString
	
	
}//end class
