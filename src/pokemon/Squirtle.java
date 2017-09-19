package pokemon;

/**
 * Squirtle.java
 * 
 * Creates and maintains instances of the pokemon, Squirtle.
 * 
 * @author Daniel Tranfaglia
 */

public class Squirtle extends Pokemon
{
	private static final int INITIAL_HP = 151;
	
	
	
	/**
	 * Squirtle Constructor
	 * 
	 * Creates an instance of Squirtle.
	 */
	
	public Squirtle ()
	{
		super("Squirtle", INITIAL_HP, Rarity.Common, Type.Water, Type.None, "images/battlesprites/squirtle.png");
	} // Squirtle Constructor
	
	
	
	/**
	 * getDescription()
	 */
	
	public String getDescription ()
	{
		return "It shelters itself in its shell, then strikes\n" +
				"back with spouts of water at every opportunity.";
	} // getDescription()
	
} // Squirtle
