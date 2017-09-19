package pokemon;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * Pokemon.java
 * 
 * Represents a pokemon to be encountered and caught in the game.
 * 
 * @author Daniel Tranfaglia
 */

public abstract class Pokemon implements Serializable {
	// Fields
	private String name;

	private HealthBar hp;
	private transient Image battleSprite;

	private Rarity rarity;
	private Type type1;
	private Type type2;

	/**
	 * Pokemon Constructor (String, int, Rarity, Type, Type, String)
	 * 
	 * Creates a generic pokemon object. All subclasses of Pokemon call this
	 * super constructor.
	 */

	protected Pokemon(String name, int hp, Rarity rarity, Type type1, Type type2, String battleSprite) {
		this.name = name;
		this.hp = new HealthBar(hp);
		this.rarity = rarity;
		this.type1 = type1;
		this.type2 = type2;
		try {
			this.battleSprite = ImageIO.read(new File(battleSprite));
		} catch (IOException e) {
			e.printStackTrace();
		}
	} // Pokemon Constructor (String, int, Rarity, Type, Type, String)

	/**
	 * getName()
	 */

	public String getName() {
		return name;
	} // getName()

	/**
	 * getHPBar()
	 * 
	 * Allows access to the health bar for this pokemon.
	 */

	public HealthBar getHPBar() {
		return hp;
	} // getHPBar()

	/**
	 * getRarity()
	 * 
	 * Returns the rarity value of this pokemon.
	 */

	public Rarity getRarity() {
		return rarity;
	} // getRarity()

	/**
	 * getBattleImage()
	 * 
	 * Returns the battle sprite of this pokemon.
	 */

	public Image getBattleImage() {
		return battleSprite;
	} // getBattleImage()

	/**
	 * getType1()
	 * 
	 * Returns the primary type of this pokemon.
	 */

	public Type getType1() {
		return type1;
	} // getType1()

	/**
	 * getType2()
	 * 
	 * Returns the secondary type of this pokemon.
	 */

	public Type getType2() {
		return type2;
	} // getType2()

	/**
	 * toString()
	 * 
	 * Returns the String representation of this pokemon.
	 */
	/*
	 * public String toString () { String retVal = "Name: " + this.getName() +
	 * "\n"; retVal += "HP: " + this.getHPBar().toString() + "\n"; retVal +=
	 * "Rarity: " + this.getRarity() + "\n"; retVal += "Type 1: " +
	 * this.getType1() + "\n"; retVal += "Type 2: " + this.getType2() + "\n";
	 * retVal += this.getDescription(); return retVal; } // toString()
	 */

	/**
	 * getDescription()
	 * 
	 * Return the description of this pokemon as a String.
	 */

	public abstract String getDescription();

} // Pokemon
