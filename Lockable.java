/**
 * This interface will determine the locked and unlocked states of items
 * @author rkelley
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */

public interface Lockable {
	/**
	 * 
	 */
	public void setKey(int key);
	//end setter
	
	
	/**
	 * 
	 */
	public void lock(int key);
	//end method
	
	
	/**
	 * 
	 */
	public void unlock(int key);
	//end method
	
	
	/**
	 * 
	 */
	public boolean isLocked();
	//end method
	
	
//end program
}
