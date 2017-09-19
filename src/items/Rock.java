package items;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Random;

import javax.imageio.ImageIO;

import pokemon.Pokemon;
import pokemon.Rarity;

public class Rock extends Items implements Serializable{
	private Random rand = new Random();
	private Image image;
	
	public Rock() {
	}

	/*
	 * Depending upon the rarity of Pokemon decide whether the Rock will affect
	 * the Pokemon or not This might affect the HP of the Pokemon
	 * 
	 * get HP on a scale of 0 to 10 get a random number from 0 to 100
	 * 
	 * if hp is less than 6, there is 70% chance that Pokemon will run else if
	 * it is a high hp, there is 50% chance that it will stay.
	 * 
	 */
	@Override
	public Decision takeDecision(Pokemon p) {
		int hp = p.getHPBar().getCurrentHP() % 10;
		int probabilityFactor = rand.nextInt(100);

		if (p.getRarity().equals(Rarity.Common)) {
			if (hp < 5) {
				if (probabilityFactor < 80)
					return Decision.Stay;
				else
					return Decision.Run;
			} else {
				if (probabilityFactor < 70)
					return Decision.Stay;
				else
					return Decision.Run;
			} 
		} else if (p.getRarity().equals(Rarity.Uncommon)) {
			if (hp < 5) {
				if (probabilityFactor < 70)
					return Decision.Stay;
				else
					return Decision.Run;
			} else if (hp < 7) {
				if (probabilityFactor < 60)
					return Decision.Stay;
				else
					return Decision.Run;
			} else {
				if (probabilityFactor < 40)
					return Decision.Stay;
				else
					return Decision.Run;
			}
		} else {
			if (hp < 5) {
				if (probabilityFactor < 50)
					return Decision.Stay;
				else
					return Decision.Run;
			} else if (hp < 7) {
				if (probabilityFactor < 30)
					return Decision.Stay;
				else
					return Decision.Run;
			} else {
				if (probabilityFactor < 20)
					return Decision.Stay;
				else
					return Decision.Run;
			}
		}
	}
	
	@Override
	public Image getImage(){
		try {
			this.image = ImageIO.read(new File("images/items/rock.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}
}
