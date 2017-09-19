package pokemon;

/**
 * Kangaskhan.java
 * 
 * Creates and maintains instances of the pokemon, Kangaskhan.
 * 
 * @author Daniel Tranfaglia
 */

public class Kangaskhan extends Pokemon
{
	private static final int INITIAL_HP = 212;
	
	
	
	/**
	 * Kangaskhan Constructor
	 * 
	 * Creates an instance of Kangaskhan.
	 */
	
	public Kangaskhan ()
	{
		super("Kangaskhan", INITIAL_HP, Rarity.Uncommon, Type.Normal, Type.None, "images/battlesprites/kangaskhan.png");
	} // Kangaskhan Constructor
	
	
	
	/**
	 * getDescription()
	 */
	
	public String getDescription ()
	{
		return "If it is safe, the young gets out of the belly\n" +
			   "pouch to play. The adult keeps a close eye on\n" +
			   "the youngster.";
	} // getDescription()
	
} // Kangaskhan
