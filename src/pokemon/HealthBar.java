package pokemon;

import java.io.Serializable;

public class HealthBar implements Serializable 
{
	// Constants
	private static final int NUM_IMAGES = 101;   // 101 images from 0% to 100%
	
	
	
	// Fields
	private int maxHP;
	private int curHP;
	
	//private Image curImage;
	//private Image[] images;
	
	
	
	/**
	 * HealthBar Constructor (int)
	 * 
	 * Creates a new health bar with the amount of HP given as an argument.
	 */
	
	public HealthBar (int HP)
	{
		this.maxHP = HP;
		this.curHP = this.maxHP;
		
		// Attempt to read and load all images
		/*images = new Image[NUM_IMAGES];
		for (int i = 0; i < NUM_IMAGES; i++)
		{
			try {
				images[i] = ImageIO.read(new File("images/healthbar/" + i + "%.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		curImage = images[NUM_IMAGES - 1];*/
	} // HealthBar Constructor (int)
	
	
	
	/**
	 * getCurrentHP()
	 * 
	 * Returns the current HP amount in this health bar.
	 */
	
	public int getCurrentHP ()
	{
		return curHP;
	} // getCurrentHP()
	
	
	
	/**
	 * getMaximumHP()
	 * 
	 * Returns the maximum HP amount in this health bar.
	 */
	
	public int getMaximumHP ()
	{
		return maxHP;
	} // getMaximumHP()
	
	
	
	/**
	 * setCurrentHP()
	 * 
	 * Changes the current HP to the value given as an argument.
	 */
	
	public void setCurrentHP (int newHP)
	{
		// New HP cannot go over the maximum
		if (newHP > maxHP)
			curHP = maxHP;
		
		// New HP cannot go below 0
		else if (newHP < 0)
			curHP = 0;
		
		// Set current HP to the given value
		else
			curHP = newHP;
		
		//curImage = images[curHP / maxHP];
	} // setCurrentHP()
	
	
	
	/**
	 * toString()
	 * 
	 * Returns the current HP and the maximum HP as a String.
	 */
	
	public String toString ()
	{
		return (curHP + " / " + maxHP);
	} // toString()
	
} // HealthBar
