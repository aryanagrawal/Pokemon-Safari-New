package controller;

import items.*;
import pokemon.*;

import java.io.Serializable;

import Player.*;


public class Battle implements Serializable{

	private Player player;
	private Items item;
	private Pokemon pokemon;

	public Battle(Player player, Items item, Pokemon pokemon) {
		this.player = player;
		this.item = item;
		this.pokemon = pokemon;
	}

	public Decision battle() {
		Decision d = item.takeDecision(pokemon);

		if (d.equals(Decision.Caught)) {
			player.addpokemon(pokemon);
			return Decision.Caught;
		} else if (d.equals(Decision.Run))
			return Decision.Run;
		else
			return Decision.Stay;
	}

}
