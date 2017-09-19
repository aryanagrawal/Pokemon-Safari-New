package items;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Random;

import javax.imageio.ImageIO;

import pokemon.Pokemon;
import pokemon.Rarity;

public class Pokeball extends Items implements Serializable{

	private Random rand = new Random();
	private Image image;

	/*
	 * Depending upon the rarity of Pokemon decide whether the Pokemon will
	 * accept the Pokeball or not. If Pokeball is compatible, add the pokemon to
	 * the list of Pokemons in the Pokeball
	 */
	@Override
	public Decision takeDecision(Pokemon p) {
		int hp = p.getHPBar().getCurrentHP() % 10;
		int probabilityFactor = rand.nextInt(100);

		if (p.getRarity().equals(Rarity.Common)) {
			if (hp < 5) {
				if (probabilityFactor < 80)
					return Decision.Caught;
				else if (probabilityFactor < 95)
					return Decision.Stay;
				else
					return Decision.Run;
			} else {
				if (probabilityFactor < 60)
					return Decision.Caught;
				else if (probabilityFactor < 85)
					return Decision.Stay;
				else
					return Decision.Run;
			}
		} else if (p.getRarity().equals(Rarity.Uncommon)) {
			if (hp < 5) {
				if (probabilityFactor < 60)
					return Decision.Caught;
				else if (probabilityFactor < 75)
					return Decision.Stay;
				else
					return Decision.Run;
			} else if (hp < 7) {
				if (probabilityFactor < 40)
					return Decision.Caught;
				else if (probabilityFactor < 65)
					return Decision.Stay;
				else
					return Decision.Run;
			} else {
				if (probabilityFactor < 30)
					return Decision.Caught;
				else if (probabilityFactor < 55)
					return Decision.Stay;
				else
					return Decision.Run;
			}
		} else {
			if (hp < 5) {
				if (probabilityFactor < 50)
					return Decision.Caught;
				else if (probabilityFactor < 75)
					return Decision.Stay;
				else
					return Decision.Run;
			} else if (hp < 7) {
				if (probabilityFactor < 35)
					return Decision.Caught;
				else if (probabilityFactor < 50)
					return Decision.Stay;
				else
					return Decision.Run;
			} else {
				if (probabilityFactor < 15)
					return Decision.Caught;
				else if (probabilityFactor < 40)
					return Decision.Stay;
				else
					return Decision.Run;
			}
		}
	}
	
	@Override
	public Image getImage(){
		try {
			this.image = ImageIO.read(new File("images/items/pokeball.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}
}
