package pokemon;

/**
 * Metapod.java
 * 
 * Creates and maintains instances of the pokemon, Metapod.
 * 
 * @author Daniel Tranfaglia
 */

public class Metapod extends Pokemon
{
	private static final int INITIAL_HP = 157;
	
	
	
	/**
	 * Metapod Constructor
	 * 
	 * Creates an instance of Metapod.
	 */
	
	public Metapod ()
	{
		super("Metapod", INITIAL_HP, Rarity.Common, Type.Bug, Type.None, "images/battlesprites/metapod.png");
	} // Metapod Constructor
	
	
	
	/**
	 * getDescription()
	 */
	
	public String getDescription ()
	{
		return "A steel-hard shell protects its tender body.\n" +
			   "It quietly endures hardships while awaiting\n" +
			   "evolution.";
	} // getDescription()
	
} // Metapod
