package pokemon;

/**
 * Bulbasaur.java
 * 
 * Creates and maintains instances of the pokemon, Bulbasaur.
 * 
 * @author Daniel Tranfaglia
 */

public class Bulbasaur extends Pokemon
{
	private static final int INITIAL_HP = 152;
	
	
	/**
	 * Bulbasaur Constructor
	 * 
	 * Creates an instance of Bulbasaur.
	 */
	
	public Bulbasaur ()
	{
		super("Bulbasaur", INITIAL_HP, Rarity.Common, Type.Grass, Type.Poison, "images/battlesprites/bulbasaur.png");
	} // Bulbasaur Constructor
	
	
	
	/**
	 * getDescription()
	 */
	
	public String getDescription ()
	{
		return "Bulbasaur can be seen napping in bright sunlight.\n" +
			   "There is a seed on its back. By soaking up the\n" +
			   "sun's rays, the seed grows progressively larger.";
	} // getDescription()
	
} // Bulbasaur
