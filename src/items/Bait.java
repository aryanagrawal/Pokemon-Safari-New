package items;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Random;

import javax.imageio.ImageIO;

import pokemon.Pokemon;
import pokemon.Rarity;

public class Bait extends Items implements Serializable{

	private Random rand = new Random();
	private Image image;

	/*
	 * Depending upon the rarity of Pokemon decide whether the Pokemon will
	 * accept the bait or not. Decide whether it will stay or not.
	 */
	@Override
	public Decision takeDecision(Pokemon p) {

		int probabilityFactor = rand.nextInt(100);

		if (p.getRarity().equals(Rarity.Common)) {
			if (probabilityFactor < 90)
				return Decision.Stay;
			else
				return Decision.Run;
		}

		else if (p.getRarity().equals(Rarity.Uncommon)) {
			if (probabilityFactor < 60)
				return Decision.Stay;
			else
				return Decision.Run;
		}

		else {
			if (probabilityFactor < 30)
				return Decision.Stay;
			else
				return Decision.Run;
		}
	}

	@Override
	public Image getImage(){
		try {
			this.image = ImageIO.read(new File("images/items/bait.png"));
		} catch (IOException e) {
		}
		return image;
	}
}
