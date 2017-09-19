package Tests;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import pokemon.*;

/**
 * PokemonTests.java
 * 
 * Runs unit tests on the entire Pokemon class hierarchy.
 * 
 * @author Daniel Tranfaglia
 */

public class PokemonTests
{
	// Create all pokemon
	private Pokemon bulbasaur  = new Bulbasaur();
	private Pokemon caterpie   = new Caterpie();
	private Pokemon charmander = new Charmander();
	private Pokemon dragonite  = new Dragonite();
	private Pokemon kangaskhan = new Kangaskhan();
	private Pokemon metapod    = new Metapod();
	private Pokemon mew        = new Mew();
	private Pokemon pidgey     = new Pidgey();
	private Pokemon pikachu    = new Pikachu();
	private Pokemon pinsir     = new Pinsir();
	private Pokemon ponyta     = new Ponyta();
	private Pokemon rhyhorn    = new Rhyhorn();
	private Pokemon scyther    = new Scyther();
	private Pokemon squirtle   = new Squirtle();
	private Pokemon tauros     = new Tauros();
	private Pokemon zubat      = new Zubat();
	
	
	
	@Test
	public void testBulbasaur()
	{
		assertEquals(bulbasaur.getName(), "Bulbasaur");
		assertEquals(bulbasaur.getHPBar().getMaximumHP(), 152);
		assertEquals(bulbasaur.getRarity(), Rarity.Common);
		assertEquals(bulbasaur.getType1(), Type.Grass);
		assertEquals(bulbasaur.getType2(), Type.Poison);
		assertEquals(bulbasaur.getDescription(), ("Bulbasaur can be seen napping in bright sunlight.\n" +
				   "There is a seed on its back. By soaking up the\n" +
				   "sun's rays, the seed grows progressively larger."));
		assertNotEquals(bulbasaur.getBattleImage(), null);
	}
	
	
	
	@Test
	public void testCaterpie()
	{
		assertEquals(caterpie.getName(), "Caterpie");
		assertEquals(caterpie.getHPBar().getMaximumHP(), 152);
		assertEquals(caterpie.getRarity(), Rarity.Common);
		assertEquals(caterpie.getType1(), Type.Bug);
		assertEquals(caterpie.getType2(), Type.None);
		assertEquals(caterpie.getDescription(), ("Its feet have suction cups designed to stick to\n" +
				   "any surface. It tenaciously climbs trees to forage."));
		assertNotEquals(caterpie.getBattleImage(), null);
	}
	
	
	
	@Test
	public void testCharmander()
	{
		assertEquals(charmander.getName(), "Charmander");
		assertEquals(charmander.getHPBar().getMaximumHP(), 146);
		assertEquals(charmander.getRarity(), Rarity.Common);
		assertEquals(charmander.getType1(), Type.Fire);
		assertEquals(charmander.getType2(), Type.None);
		assertEquals(charmander.getDescription(), ("The flame on its tail indicates Charmander's life\n" +
				   "force. If it is healthy, the flame burns brightly."));
		assertNotEquals(charmander.getBattleImage(), null);
	}
	
	
	
	@Test
	public void testDragonite()
	{
		assertEquals(dragonite.getName(), "Dragonite");
		assertEquals(dragonite.getHPBar().getMaximumHP(), 198);
		assertEquals(dragonite.getRarity(), Rarity.Rare);
		assertEquals(dragonite.getType1(), Type.Dragon);
		assertEquals(dragonite.getType2(), Type.Flying);
		assertEquals(dragonite.getDescription(), ("Dragonite is capable of circling the globe in just\n" +
				   "16 hours. It is a kindhearted Pokemon that leads\n" +
				   "lost ships in a storm to the safety of land."));
		assertNotEquals(dragonite.getBattleImage(), null);
	}
	
	
	
	@Test
	public void testKangaskhan()
	{
		assertEquals(kangaskhan.getName(), "Kangaskhan");
		assertEquals(kangaskhan.getHPBar().getMaximumHP(), 212);
		assertEquals(kangaskhan.getRarity(), Rarity.Uncommon);
		assertEquals(kangaskhan.getType1(), Type.Normal);
		assertEquals(kangaskhan.getType2(), Type.None);
		assertEquals(kangaskhan.getDescription(), ("If it is safe, the young gets out of the belly\n" +
				   "pouch to play. The adult keeps a close eye on\n" +
				   "the youngster."));
		assertNotEquals(kangaskhan.getBattleImage(), null);
	}
	
	
	
	@Test
	public void testMetapod()
	{
		assertEquals(metapod.getName(), "Metapod");
		assertEquals(metapod.getHPBar().getMaximumHP(), 157);
		assertEquals(metapod.getRarity(), Rarity.Common);
		assertEquals(metapod.getType1(), Type.Bug);
		assertEquals(metapod.getType2(), Type.None);
		assertEquals(metapod.getDescription(), ("A steel-hard shell protects its tender body.\n" +
				   "It quietly endures hardships while awaiting\n" +
				   "evolution."));
		assertNotEquals(metapod.getBattleImage(), null);
	}
	
	
	
	@Test
	public void testMew()
	{
		assertEquals(mew.getName(), "Mew");
		assertEquals(mew.getHPBar().getMaximumHP(), 207);
		assertEquals(mew.getRarity(), Rarity.Rare);
		assertEquals(mew.getType1(), Type.Psychic);
		assertEquals(mew.getType2(), Type.None);
		assertEquals(mew.getDescription(), ("Its DNA is said to contain the genetic codes of\n" +
				   "all Pokemon, so it can use all kinds of\n" +
				   "techniques."));
		assertNotEquals(mew.getBattleImage(), null);
	}
	
	
	
	@Test
	public void testPidgey()
	{
		assertEquals(pidgey.getName(), "Pidgey");
		assertEquals(pidgey.getHPBar().getMaximumHP(), 147);
		assertEquals(pidgey.getRarity(), Rarity.Common);
		assertEquals(pidgey.getType1(), Type.Normal);
		assertEquals(pidgey.getType2(), Type.Flying);
		assertEquals(pidgey.getDescription(), ("It is docile and prefers to avoid conflict.\n" +
				   "If disturbed, however, it can ferociously\n" +
				   "strike back."));
		assertNotEquals(pidgey.getBattleImage(), null);
	}
	
	
	
	@Test
	public void testPikachu()
	{
		assertEquals(pikachu.getName(), "Pikachu");
		assertEquals(pikachu.getHPBar().getMaximumHP(), 142);
		assertEquals(pikachu.getRarity(), Rarity.Common);
		assertEquals(pikachu.getType1(), Type.Electric);
		assertEquals(pikachu.getType2(), Type.None);
		assertEquals(pikachu.getDescription(), ("It raises its tail to check its surroundings.\n" +
				   "The tail is sometimes struck by lightning\n" +
				   "in this pose."));
		assertNotEquals(pikachu.getBattleImage(), null);
	}
	
	
	
	@Test
	public void testPinsir()
	{
		assertEquals(pinsir.getName(), "Pinsir");
		assertEquals(pinsir.getHPBar().getMaximumHP(), 172);
		assertEquals(pinsir.getRarity(), Rarity.Uncommon);
		assertEquals(pinsir.getType1(), Type.Bug);
		assertEquals(pinsir.getType2(), Type.None);
		assertEquals(pinsir.getDescription(), ("It swings its long antlers wildly to attack.\n" +
				   "During cold periods, it hides deep in forests."));
		assertNotEquals(pinsir.getBattleImage(), null);
	}
	
	
	
	@Test
	public void testPonyta()
	{
		assertEquals(ponyta.getName(), "Ponyta");
		assertEquals(ponyta.getHPBar().getMaximumHP(), 157);
		assertEquals(ponyta.getRarity(), Rarity.Common);
		assertEquals(ponyta.getType1(), Type.Fire);
		assertEquals(ponyta.getType2(), Type.None);
		assertEquals(ponyta.getDescription(), ("Its legs grow strong while it chases after its\n" +
		           "parent. It runs in fields and mountains all day."));
		assertNotEquals(ponyta.getBattleImage(), null);
	}
	
	
	
	@Test
	public void testRhyhorn()
	{
		assertEquals(rhyhorn.getName(), "Rhyhorn");
		assertEquals(rhyhorn.getHPBar().getMaximumHP(), 187);
		assertEquals(rhyhorn.getRarity(), Rarity.Uncommon);
		assertEquals(rhyhorn.getType1(), Type.Ground);
		assertEquals(rhyhorn.getType2(), Type.Rock);
		assertEquals(rhyhorn.getDescription(), ("It is inept at turning because of its four short\n" +
				   "legs. It can only charge and run in one direction."));
		assertNotEquals(rhyhorn.getBattleImage(), null);
	}
	
	
	
	@Test
	public void testScyther()
	{
		assertEquals(scyther.getName(), "Scyther");
		assertEquals(scyther.getHPBar().getMaximumHP(), 177);
		assertEquals(scyther.getRarity(), Rarity.Uncommon);
		assertEquals(scyther.getType1(), Type.Bug);
		assertEquals(scyther.getType2(), Type.Flying);
		assertEquals(scyther.getDescription(), ("It slashes through grass with its sharp scythes,\n" +
				   "moving too fast for the human eye to track."));
		assertNotEquals(scyther.getBattleImage(), null);
	}
	
	
	
	@Test
	public void testSquirtle()
	{
		assertEquals(squirtle.getName(), "Squirtle");
		assertEquals(squirtle.getHPBar().getMaximumHP(), 151);
		assertEquals(squirtle.getRarity(), Rarity.Common);
		assertEquals(squirtle.getType1(), Type.Water);
		assertEquals(squirtle.getType2(), Type.None);
		assertEquals(squirtle.getDescription(), ("It shelters itself in its shell, then strikes\n" +
				"back with spouts of water at every opportunity."));
		assertNotEquals(squirtle.getBattleImage(), null);
	}
	
	
	
	@Test
	public void testTauros()
	{
		assertEquals(tauros.getName(), "Tauros");
		assertEquals(tauros.getHPBar().getMaximumHP(), 182);
		assertEquals(tauros.getRarity(), Rarity.Uncommon);
		assertEquals(tauros.getType1(), Type.Normal);
		assertEquals(tauros.getType2(), Type.None);
		assertEquals(tauros.getDescription(), ("After heightening its will to fight by whipping\n" +
				   "itself with its three tails, it charges at full\n" +
				   "speed."));
		assertNotEquals(tauros.getBattleImage(), null);
	}
	
	
	
	@Test
	public void testZubat()
	{
		assertEquals(zubat.getName(), "Zubat");
		assertEquals(zubat.getHPBar().getMaximumHP(), 147);
		assertEquals(zubat.getRarity(), Rarity.Common);
		assertEquals(zubat.getType1(), Type.Poison);
		assertEquals(zubat.getType2(), Type.Flying);
		assertEquals(zubat.getDescription(), ("It has no eyes. Instead, it relies on its\n" +
		           "ultrasonic cries for echolocation to flit\n" +
				   "about in darkness."));
		assertNotEquals(zubat.getBattleImage(), null);
	}
	
} // PokemonTests
