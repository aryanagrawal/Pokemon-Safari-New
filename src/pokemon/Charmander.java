package pokemon;

/**
 * Charmander.java
 * 
 * Creates and maintains instances of the pokemon, Charmander.
 * 
 * @author Daniel Tranfaglia
 */

public class Charmander extends Pokemon
{
	private static final int INITIAL_HP = 146;
	
	
	
	/**
	 * Charmander Constructor
	 * 
	 * Creates an instance of Charmander.
	 */
	
	public Charmander ()
	{
		super("Charmander", INITIAL_HP, Rarity.Common, Type.Fire, Type.None, "images/battlesprites/charmander.png");
	} // Charmander Constructor
	
	
	
	/**
	 * getDescription()
	 */
	
	public String getDescription ()
	{
		return "The flame on its tail indicates Charmander's life\n" +
			   "force. If it is healthy, the flame burns brightly.";
	} // getDescription()
	
} // Charmander
