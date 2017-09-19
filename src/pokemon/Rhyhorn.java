package pokemon;

/**
 * Rhyhorn.java
 * 
 * Creates and maintains instances of the pokemon, Rhyhorn.
 * 
 * @author Daniel Tranfaglia
 */

public class Rhyhorn extends Pokemon
{
	private static final int INITIAL_HP = 187;
	
	
	
	/**
	 * Rhyhorn Constructor
	 * 
	 * Creates an instance of Rhyhorn.
	 */
	
	public Rhyhorn ()
	{
		super("Rhyhorn", INITIAL_HP, Rarity.Uncommon, Type.Ground, Type.Rock, "images/battlesprites/rhyhorn.png");
	} // Rhyhorn Constructor
	
	
	
	/**
	 * getDescription()
	 */
	
	public String getDescription ()
	{
		return "It is inept at turning because of its four short\n" +
			   "legs. It can only charge and run in one direction.";
	} // getDescription()
	
} // Rhyhorn
