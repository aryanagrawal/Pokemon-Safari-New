package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import pokemon.Bulbasaur;
import pokemon.Pokemon;
import controller.Game;

public class gameTests {

	@Test
	public void testGame(){
		Game game = new Game("Pikachu", "500 Steps");
		assertEquals(30, game.getPokeballCount());
		System.out.print("Random Player Location: ("+game.PlayerXLocation() + ", ");
		System.out.print(game.PlayerYLocation()+"); Directioin: ");
		System.out.println(game.getPlayerDirection());
		
		System.out.println("Max Steps the player can walk = " + game.maximumSteps());
		System.out.println("Number of rocks = " + game.getRock());
//		System.out.println("Number of rocks = " + game.getRock());
//		System.out.println("Number of rocks = " + game.getRock());
//		System.out.println("Number of rocks = " + game.getPokemonStr());
	}
	
	

}
