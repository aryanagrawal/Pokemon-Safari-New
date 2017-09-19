package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import items.*;
import pokemon.Caterpie;
import pokemon.Mew;
import pokemon.Pokemon;
import pokemon.Scyther;

/**
 * ItemTests.java
 * 
 * Runs tests on the items used in battle.
 * 
 * @author Daniel Tranfaglia
 */

public class ItemTests
{
	private Items bait = new Bait();
	private Items rock = new Rock();
	private Items pokeball = new Pokeball();
	private Items runaway = new RunAway();
	
	private Pokemon caterpie = new Caterpie();
	private Pokemon scyther  = new Scyther();
	private Pokemon mew      = new Mew();
	
	
	
	@Test
	public void testBait_TakeDecision()
	{
		for (int i = 0; i < 250; i++)
		{
			pokeball.takeDecision(caterpie);
			pokeball.takeDecision(scyther);
			pokeball.takeDecision(mew);
			rock.takeDecision(caterpie);
			rock.takeDecision(scyther);
			rock.takeDecision(mew);
			bait.takeDecision(caterpie);
			bait.takeDecision(scyther);
			bait.takeDecision(mew);
			caterpie.getHPBar().setCurrentHP(36);
			mew.getHPBar().setCurrentHP(36);
			scyther.getHPBar().setCurrentHP(36);
			pokeball.takeDecision(caterpie);
			pokeball.takeDecision(scyther);
			pokeball.takeDecision(mew);
			rock.takeDecision(caterpie);
			rock.takeDecision(scyther);
			rock.takeDecision(mew);
			bait.takeDecision(caterpie);
			bait.takeDecision(scyther);
			bait.takeDecision(mew);
			caterpie.getHPBar().setCurrentHP(34);
			mew.getHPBar().setCurrentHP(34);
			scyther.getHPBar().setCurrentHP(34);
			pokeball.takeDecision(caterpie);
			pokeball.takeDecision(scyther);
			pokeball.takeDecision(mew);
			rock.takeDecision(caterpie);
			rock.takeDecision(scyther);
			rock.takeDecision(mew);
			bait.takeDecision(caterpie);
			bait.takeDecision(scyther);
			bait.takeDecision(mew);
		}
	}
	
	
	
	@Test
	public void testBait_getImage()
	{
		assertNotEquals(bait.getImage(), null);
		rock.getImage();
		pokeball.getImage();
	}
	
	
	
	@Test
	public void testRunAway_TakeDecision()
	{
		assertEquals(runaway.takeDecision(caterpie), Decision.Stay);
		assertEquals(runaway.getImage(), null);
	}
	
	
	
	public void testRock_TakeDecision()
	{
		for (int i = 0; i < 250; i++)
		{
			rock.takeDecision(caterpie);
			rock.takeDecision(scyther);
			rock.takeDecision(mew);
		}
	}
	
	
	
	public void testRock_getImage()
	{
		assertNotEquals(rock.getImage(), null);
	}
	
	
	
	public void testPokeball_TakeDecision()
	{
		for (int i = 0; i < 250; i++)
		{
			pokeball.takeDecision(caterpie);
			pokeball.takeDecision(scyther);
			pokeball.takeDecision(mew);
		}
	}
	
	
	
	public void testPokeball_getImage()
	{
		assertNotEquals(pokeball.getImage(), null);
	}
	
} // ItemTests
