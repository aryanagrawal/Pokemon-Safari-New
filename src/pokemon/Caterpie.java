package pokemon;

/**
 * Caterpie.java
 * 
 * Creates and maintains instances of the pokemon, Caterpie.
 * 
 * @author Daniel Tranfaglia
 */

public class Caterpie extends Pokemon
{
	private static final int INITIAL_HP = 152;
	
	
	
	/**
	 * Caterpie Constructor
	 * 
	 * Creates an instance of Caterpie.
	 */
	
	public Caterpie ()
	{
		super("Caterpie", INITIAL_HP, Rarity.Common, Type.Bug, Type.None, "images/battlesprites/caterpie.png");
	} // Caterpie Constructor
	
	
	
	/**
	 * getDescription()
	 */
	
	public String getDescription ()
	{
		return "Its feet have suction cups designed to stick to\n" +
			   "any surface. It tenaciously climbs trees to forage.";
	} // getDescription()
	
} // Caterpie
