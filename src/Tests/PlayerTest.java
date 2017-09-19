package Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import map.Map;
import pokemon.Pikachu;
import pokemon.Pokemon;
import Player.Player;

public class PlayerTest {
	@Test
	public void testBoy() {
		Player p = new Player("S", "pikaachu", 0);

		assertEquals("S", p.getID());
		assertEquals("pikaachu", p.getPlayerSprite());
		assertEquals("North", p.getDir());
		p.move("North", true);
		assertEquals("North", p.getDir());
		p.move("South", true);
		assertEquals("South", p.getDir());
		p.move("West", true);
		assertEquals("West", p.getDir());
		p.move("East", true);
		assertEquals("East", p.getDir());
		Pokemon pm = new Pikachu();
		assertEquals(1, p.getPokemons().size());
		assertEquals(pm.getClass(), p.getPokemons().get(0).getClass());
		p.removepokemon(pm);
		assertEquals(0, p.getPokemons().size());
		p.addpokemon(pm);
		assertEquals(1, p.getPokemons().size());
		assertEquals(pm.getClass(), p.getPokemons().get(0).getClass());
		
		assertEquals(4, p.hasWalked());
		
		
		Player q = new Player("Ss", "lucario", 0);
		assertEquals("Ss", q.getID());
		assertEquals("lucario", q.getPlayerSprite());
	}

}
