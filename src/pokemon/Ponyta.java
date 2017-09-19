package pokemon;

/**
 * Ponyta.java
 * 
 * Creates and maintains instances of the pokemon, Ponyta.
 * 
 * @author Daniel Tranfaglia
 */

public class Ponyta extends Pokemon
{
	private static final int INITIAL_HP = 157;
	
	
	
	/**
	 * Ponyta Constructor
	 * 
	 * Creates an instance of Ponyta.
	 */
	
	public Ponyta ()
	{
		super("Ponyta", INITIAL_HP, Rarity.Common, Type.Fire, Type.None, "images/battlesprites/ponyta.png");
	} // Ponyta Constructor
	
	
	
	/**
	 * getDescription()
	 */
	
	public String getDescription ()
	{
		return "Its legs grow strong while it chases after its\n" +
	           "parent. It runs in fields and mountains all day.";
	} // getDescription()
	
} // Ponyta
