package pokemon;

/**
 * Dragonite.java
 * 
 * Creates and maintains instances of the pokemon, Dragonite.
 * 
 * @author Daniel Tranfaglia
 */

public class Dragonite extends Pokemon
{
	private static final int INITIAL_HP = 198;
	
	
	
	/**
	 * Dragonite Constructor
	 * 
	 * Creates an instance of Dragonite.
	 */
	
	public Dragonite ()
	{
		super("Dragonite", INITIAL_HP, Rarity.Rare, Type.Dragon, Type.Flying, "images/battlesprites/dragonite.png");
	} // Dragonite Constructor
	
	
	
	/**
	 * getDescription()
	 */
	
	public String getDescription ()
	{
		return "Dragonite is capable of circling the globe in just\n" +
			   "16 hours. It is a kindhearted Pokemon that leads\n" +
			   "lost ships in a storm to the safety of land.";
	} // getDesription()
	
} // Dragonite
