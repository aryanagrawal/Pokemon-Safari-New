//Starter
package items;

import java.awt.Image;

import pokemon.Pokemon;



/*
 * Rarity:	Common, Uncommon, Rare
 * 
 * Type: 	Normal, Fire, Water, Electric, Grass, Ice,
			Fighting, Poison, Ground, Flying, Psychic,
			Bug, Rock, Ghost, Dragon, Dark, Steel, Fairy,
			None
			
	getHp, setHp
 */

public abstract class Items {

	/*
	 * This function decides how the pokemon should behave/react
	 * to a particular Item.
	 * This is therefore an abstract funciton
	 * and hence it works differently for different funcitons
	 */
	public abstract Decision takeDecision(Pokemon p);
	public abstract Image getImage();
//	public abstract void throwItem(Item item);

}
