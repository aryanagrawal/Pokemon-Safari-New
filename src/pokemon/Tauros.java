package pokemon;

/**
 * Tauros.java
 * 
 * Creates and maintains instances of the pokemon, Tauros.
 * 
 * @author Daniel Tranfaglia
 */

public class Tauros extends Pokemon
{
	private static final int INITIAL_HP = 182;
	
	
	
	/**
	 * Tauros Constructor
	 * 
	 * Creates an instance of Tauros.
	 */
	
	public Tauros ()
	{
		super("Tauros", INITIAL_HP, Rarity.Uncommon, Type.Normal, Type.None, "images/battlesprites/tauros.png");
	} // Tauros Constructor
	
	
	
	/**
	 * getDescription()
	 */
	
	public String getDescription ()
	{
		return "After heightening its will to fight by whipping\n" +
			   "itself with its three tails, it charges at full\n" +
			   "speed.";
	} // getDescription()
	
} // Tauros
