package pokemon;

/**
 * Scyther.java
 * 
 * Creates and maintains instances of the pokemon, Scyther.
 * 
 * @author Daniel Tranfaglia
 */

public class Scyther extends Pokemon
{
	private static final int INITIAL_HP = 177;
	
	
	
	/**
	 * Scyther Constructor
	 * 
	 * Creates an instance of Scyther.
	 */
	
	public Scyther ()
	{
		super("Scyther", INITIAL_HP, Rarity.Uncommon, Type.Bug, Type.Flying, "images/battlesprites/scyther.png");
	} // Scyther Constructor
	
	
	
	/**
	 * getDescription()
	 */
	
	public String getDescription ()
	{
		return "It slashes through grass with its sharp scythes,\n" +
			   "moving too fast for the human eye to track.";
	} // getDescription()
	
} // Scyther
