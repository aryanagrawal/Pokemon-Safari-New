package items;

import java.awt.Image;
import java.io.Serializable;

import pokemon.Pokemon;

public class RunAway extends Items implements Serializable {

	@Override
	public Decision takeDecision(Pokemon p) {
		return Decision.Stay;
	}

	@Override
	public Image getImage() {
		return null;
	}
}
