package pokemon;

/**
 * Mew.java
 * 
 * Creates and maintains instances of the pokemon, Mew.
 * 
 * @author Daniel Tranfaglia
 */

public class Mew extends Pokemon
{
	private static final int INITIAL_HP = 207;
	
	
	
	/**
	 * Mew Constructor
	 * 
	 * Creates an instance of Mew.
	 */
	
	public Mew ()
	{
		super("Mew", INITIAL_HP, Rarity.Rare, Type.Psychic, Type.None, "images/battlesprites/mew.png");
	} // Mew Constructor
	
	
	
	/**
	 * getDescription()
	 */
	
	public String getDescription ()
	{
		return "Its DNA is said to contain the genetic codes of\n" +
			   "all Pokemon, so it can use all kinds of\n" +
			   "techniques.";
	} // getDescription()
	
} // Mew
