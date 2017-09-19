package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Player.Player;
import controller.Battle;
import items.*;
import pokemon.*;

public class TestBattle {

	@Test
	public void testBattle(){
		
		Player player = new Player("Ash", "male", 0);
		Items rock = new Rock();
		Items bait = new Bait();
		Items pokeball = new Pokeball();
		Items runaway = new RunAway();
		Pokemon mew = new Mew();
		Pokemon pinsir = new Pinsir();
		Pokemon pikachu = new Pikachu();
	    (new Battle(player, rock, mew)).battle();
	    (new Battle(player, pokeball, pikachu)).battle();
	    (new Battle(player, rock, mew)).battle();
	    (new Battle(player, pokeball, mew)).battle();
	    (new Battle(player, runaway, mew)).battle();
	    (new Battle(player, rock, pikachu)).battle();
	}
}
