package pokemon;

/**
 * Zubat.java
 * 
 * Creates and maintains instances of the pokemon, Zubat.
 * 
 * @author Daniel Tranfaglia
 */

public class Zubat extends Pokemon
{
	private static final int INITIAL_HP = 147;
	
	
	
	/**
	 * Zubat Constructor
	 * 
	 * Creates an instance of Zubat.
	 */
	
	public Zubat ()
	{
		super("Zubat", INITIAL_HP, Rarity.Common, Type.Poison, Type.Flying, "images/battlesprites/zubat.png");
	} // Pinsir Constructor
	
	
	
	/**
	 * getDescription()
	 */
	
	public String getDescription ()
	{
		return "It has no eyes. Instead, it relies on its\n" +
	           "ultrasonic cries for echolocation to flit\n" +
			   "about in darkness.";
	} // getDescription()
	
} // Zubat
