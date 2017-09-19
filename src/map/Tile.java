package map;

import java.io.Serializable;

public enum Tile implements Serializable  {
	TREE('T'), GRASS('G'), GRASSPATCH('P'), WATER('W'), DIRT('D'), FENCE('F'), ENTERENCE('E');

	private char tile;
	Tile(char tile){
		this.tile = tile;
	}
	public char toChar() {
		return tile;
	}
}
