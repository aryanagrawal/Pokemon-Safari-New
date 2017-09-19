package Player;

import java.io.Serializable;
import java.util.ArrayList;
import pokemon.Pikachu;
import pokemon.Pokemon;

@SuppressWarnings("serial")
public class Player implements Serializable {
	protected String ID;
	public static final String FILE_NAME = "Player.srp";
	protected String dirToFace;
	protected String playerSprite;
	protected ArrayList<Pokemon> PokemonsList;
	protected int Steps;
	protected boolean isbattling;
	protected boolean isGG;
	protected int NumofPokemonBall;

	/*
	 * The constructor
	 */
	public Player(String userName, String defaultType, int Steps) {
		ID = userName;
		playerSprite=defaultType;
		dirToFace = "South";
		this.Steps = Steps;
		NumofPokemonBall = 30;
		isbattling = false;
		isGG = false;
		PokemonsList = new ArrayList<Pokemon>();
		// ItemsList= new ArrayList<Items>();

	}
	
	public int pokeballCount(){
		return NumofPokemonBall;
	}

	/*
	 * ID getter
	 */
	public String getID() {
		return ID;
	}

	/*
	 * cast getter
	 */
	public String getPlayerSprite() {
		return playerSprite;
	}

	/*
	 * Get the face of the player.
	 */
	public String getDir() {
		return dirToFace;
	}

	public void move(String s, boolean moved) {
		switch (s) {
		case "North":
			dirToFace = s;
			break;
		case "South":
			dirToFace = s;
			break;
		case "West":
			dirToFace = s;
			break;
		case "East":
			dirToFace = s;
			break;
		}
		// System.out.println("Direction:  " + dirToFace);
		if (moved == true) {
			Steps++;
		}
		// this.setChanged();
		// notifyObservers();
	}

	/*
	 * The getter of the pokemon ArrayList that holds all pokemons
	 */
	public ArrayList<Pokemon> getPokemons() {
		return PokemonsList;
	}

	/*
	 * Remove the input pokemon from the list
	 */
	public void removepokemon(Pokemon p) {
		for (int i = 0; i < PokemonsList.size(); i++)
			if (PokemonsList.get(i).getClass().equals(p.getClass()))
				PokemonsList.remove(i);
	}

	/*
	 * Add the input pokemon into the list
	 */
	public void addpokemon(Pokemon p) {
		PokemonsList.add(p);
		NumofPokemonBall--;
	}

	public int hasWalked() {
		return Steps;
	};

}
