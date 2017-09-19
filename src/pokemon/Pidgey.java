package pokemon;

/**
 * Pidgey.java
 * 
 * Creates and maintains instances of the pokemon, Pidgey.
 * 
 * @author Daniel Tranfaglia
 */

public class Pidgey extends Pokemon
{
	private static final int INITIAL_HP = 147;
	
	
	
	/**
	 * Pidgey Constructor
	 * 
	 * Creates an instance of Pidgey.
	 */
	
	public Pidgey ()
	{
		super("Pidgey", INITIAL_HP, Rarity.Common, Type.Normal, Type.Flying, "images/battlesprites/pidgey.png");
	} // Pidgey Constructor
	
	
	
	/**
	 * getDescription()
	 */
	
	public String getDescription ()
	{
		return "It is docile and prefers to avoid conflict.\n" +
			   "If disturbed, however, it can ferociously\n" +
			   "strike back.";
	} // getDescription()
	
} // Pidgey
