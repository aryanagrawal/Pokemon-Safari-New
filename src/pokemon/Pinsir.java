package pokemon;

/**
 * Pinsir.java
 * 
 * Creates and maintains instances of the pokemon, Pinsir.
 * 
 * @author Daniel Tranfaglia
 */

public class Pinsir extends Pokemon
{
	private static final int INITIAL_HP = 172;
	
	
	
	/**
	 * Pinsir Constructor
	 * 
	 * Creates an instance of Pinsir.
	 */
	
	public Pinsir ()
	{
		super("Pinsir", INITIAL_HP, Rarity.Uncommon, Type.Bug, Type.None, "images/battlesprites/pinsir.png");
	} // Pinsir Constructor
	
	
	
	/**
	 * getDescription()
	 */
	
	public String getDescription ()
	{
		return "It swings its long antlers wildly to attack.\n" +
			   "During cold periods, it hides deep in forests.";
	} // getDescription()
	
} // Pinsir
