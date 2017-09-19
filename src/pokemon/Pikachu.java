package pokemon;

import java.io.Serializable;

/**
 * Pikachu.java
 * 
 * Creates and maintains instances of the pokemon, Pikachu.
 * 
 * @author Daniel Tranfaglia
 */

@SuppressWarnings("serial")
public class Pikachu extends Pokemon {
	private static final int INITIAL_HP = 142;
	
	
	
	/**
	 * Pikachu Constructor
	 * 
	 * Creates an instance of Pikachu.
	 */
	
	public Pikachu ()
	{
		super("Pikachu", INITIAL_HP, Rarity.Common, Type.Electric, Type.None, "images/battlesprites/pikachu.png");
	} // Pikachu Constructor
	
	
	
	/**
	 * getDescription()
	 */
	
	public String getDescription ()
	{
		return "It raises its tail to check its surroundings.\n" +
			   "The tail is sometimes struck by lightning\n" +
			   "in this pose.";
	} // getDescription()
	
} // Pikachu
