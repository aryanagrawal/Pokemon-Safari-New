package controller;

import java.applet.Applet;
import java.applet.AudioClip;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Observable;
import java.util.Random;

import javax.imageio.ImageIO;

import Player.Player;
import items.Bait;
import items.Decision;
import items.Pokeball;
import items.Rock;
import map.ManuelRoom;
import map.Map;
import pokemon.*;

@SuppressWarnings("serial")
public class Game extends Observable implements Serializable {

	private int numofRocks;

	public static final String FILE_NAME = "GameObject.srp";
	private transient BufferedImage playerSpriteSheet;
	private Map safariZone;
	private Map startZone;
	private Map map;
	private Battle battle;
	private Player player;
	private String type;
	private Pokemon current;
	private String winCondition;

	private boolean isBattling;

	private static final int MAX_STEPS = 500;

	private static Pokemon[] commonEncounters = { new Caterpie(), new Metapod(), new Pidgey(), new Pikachu(),
			new Ponyta(), new Zubat(), new Bulbasaur(), new Charmander(), new Squirtle() };
	private static Pokemon[] uncommonEncounters = { new Kangaskhan(), new Pinsir(), new Rhyhorn(), new Scyther(),
			new Tauros() };
	private static Pokemon[] rareEncounters = { new Dragonite(), new Mew() };

	public Game(String pokemonType, String winCondition) {
		safariZone = new Map(200, 25, 20, 40);// mapSize, rooms, roomMin,
												// roomMax
		ManuelRoom mr = new ManuelRoom();
		startZone = new Map(mr.getStartMap());
		type = pokemonType;
		this.winCondition = winCondition;
		map = safariZone;
		// System.out.println(map.toString());
		player = new Player("Envyhuntress", type, 0);
		numofRocks = 100;
		isBattling = false;
		battle = null;
		loadImages();
	}

	// GETTERS

	// get the player's current X location
	public int PlayerXLocation() {
		return map.PlayerXStart();
	}

	// get the player's current Y location
	public int PlayerYLocation() {
		return map.PlayerYStart();
	}

	// get the number of pokeballs the player posses
	public int getPokeballCount() {
		return player.pokeballCount();
	}

	// get maximum steps the player can walk
	public int maximumSteps() {
		return MAX_STEPS;
	}

	public int getRock() {

		return numofRocks;
	}

	public String getPokemonStr() {

		return "nothing";
	}

	public String getItemStr() {

		return "Pokeball    " + this.getPokeballCount();
	}

	public String getItemStr1() {

		return "Rocks        " + this.getRock();
	}

	public void loadImages() {
		try {
			if (player.getPlayerSprite().equals("Pikachu")) {
				playerSpriteSheet = ImageIO
						.read(new File("images" + File.separator + "trainer" + File.separator + "pikachu.png"));
			} else {
				playerSpriteSheet = ImageIO
						.read(new File("images" + File.separator + "trainer" + File.separator + "lucario.png"));
			}
		} catch (IOException e) {
			System.err.println("Trainer Image Not Found");
		}

	}

	boolean start = false;

	// checkForPokemon()
	// Determines if a pokemon is encountered in grass.
	public boolean enterDoor() {
		if (map.getPlayerTile().toChar() == 'E') {
			map = switchMap();
			map.setPlayersLocation();
			return true;
		}
		return false;
	}

	public Map switchMap() {
		if (start) {
			start = !start;
			return safariZone;
		} else {
			start = !start;
			return startZone;
		}
	}

	public String toStringView() {
		return map.toStringView();
	}

	public int playerHasWalked() {
		return player.hasWalked();
	}

	public void movePlayerDirection(String direction, boolean movedBoolean) {
		player.move(direction, movedBoolean);

	}

	public boolean movePlayerLocation(int xAxis, int yAxis) {
		boolean result = map.move(xAxis, yAxis);
		this.setChanged();
		notifyObservers();
		return result;
	}

	public Player getPlayer() {
		return player;
	}

	public boolean checkForPokemon() {
		if (map.getPlayerTile().toChar() == 'G') {
			Random rand = new Random();
			int chance = rand.nextInt(100);

			// 15% chance to encounter a pokemon
			if (chance < 15) {
				return true;
			}
		}
		return false;
	}

	public void endBattle() {
		System.out.println("im tired of these mother fucking snakes");
	}

	/**
	 * decidePokemon()
	 * 
	 * @author Daniel Tranfaglia
	 * 
	 *         Determines which pokemon to return given a random chance.
	 */

	private Pokemon decidePokemon() {
		Random rand = new Random();

		int randomGroup = rand.nextInt(100000);

		if (randomGroup <= 99500)
			return commonEncounters[rand.nextInt(commonEncounters.length)];
		else if (randomGroup < 99999)
			return uncommonEncounters[rand.nextInt(uncommonEncounters.length)];
		else
			return rareEncounters[rand.nextInt(rareEncounters.length)];
	}

	public void playCry() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		AudioClip cry = null;
		URL url = null;

		String baseFolder = "file:";

		try {
			url = new URL(baseFolder + "cries/" + (current.getName().toLowerCase()) + ".wav");
			cry = Applet.newAudioClip(url);
		} catch (MalformedURLException e) {
			System.out.println("Bad file path: " + url);
		}

		cry.play();
	}

	/**
	 * battle()
	 * 
	 * @author Daniel Tranfaglia
	 * 
	 *         Handles the battle commands and decides what actions to take,
	 *         depending on what item the player wants to use.
	 */

	public Decision battle(String decision, Pokemon encounter) {
		Decision d;
		if (decision.toLowerCase().equals("throw ball")) {
			battle = new Battle(player, new Pokeball(), encounter);
			d = battle.battle();
		}

		else if (decision.toLowerCase().equals("throw bait")) {
			battle = new Battle(player, new Bait(), encounter);
			d = battle.battle();
		}

		else if (decision.toLowerCase().equals("throw rock")) {
			battle = new Battle(player, new Rock(), encounter);
			d = battle.battle();
		}

		else {
			d = Decision.Run;
		}

		if(d.equals(Decision.Caught) || d.equals(Decision.Run))
			this.isBattling = false;
		else this.isBattling = true;

		return d;
	}

	public Pokemon currentPokemon(int status) {
		if (status == 0) {
			current = null;
			return current;
		} else if (status == 1) {
			current = decidePokemon();
			playCry();
			return current;
		} else {
			return current;
		}

	}

	public String getPlayerDirection() {
		return player.getDir();
	}

	public Map getCurrentMap() {
		return map;
	}

	public BufferedImage getPlayerSprite() {
		BufferedImage result = null;

		// System.out.println(spriteWidth+" " + spriteHeight);
		String playerDir = player.getDir();
		switch (playerDir) {
		case "South":
			if (player.hasWalked() % 2 == 0)
				result = playerSpriteSheet.getSubimage(128, 0, 64, 64);
			else
				result = playerSpriteSheet.getSubimage(0, 0, 64, 64);
			break;
		case "West":
			if (player.hasWalked() % 2 == 0)
				result = playerSpriteSheet.getSubimage(128, 64, 64, 64);
			else
				result = playerSpriteSheet.getSubimage(0, 64, 64, 64);
			break;
		case "East":
			if (player.hasWalked() % 2 == 0)
				result = playerSpriteSheet.getSubimage(128, 128, 64, 64);
			else
				result = playerSpriteSheet.getSubimage(0, 128, 64, 64);
			break;
		case "North":
			if (player.hasWalked() % 2 == 0)
				result = playerSpriteSheet.getSubimage(128, 192, 64, 64);
			else
				result = playerSpriteSheet.getSubimage(0, 192, 64, 64);
			break;
		}
		return result;
	}

	public boolean Over() {
		if (winCondition.equals("500 Steps")) {
			if (playerHasWalked() < maximumSteps()) {
				return true;
			}
		} else {
			if (getPokeballCount() > 0) {
				return true;
			}
		}
		return false;
	}

	public boolean checkBattle(int output) {
		if (output == 1) {
			isBattling = true;
		} else {
			isBattling = false;
		}
		return isBattling;
	}

	public boolean inBattle() {
		return isBattling;
	}

	/*
	 * --returns an object array for building a JTable
	 */
	public Object[][] getData() {
		Object[][] result = { { "Pokeball", this.getPokeballCount() }, { "Rock", this.getRock() }, };
		return result;
	}

}
