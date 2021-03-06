package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import map.Map;
import map.Tile;

public class CustomMapInsertTests {

	@Test
	public void testMapPrint() {
		Tile[][] cMap = new Tile[][]{
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.GRASS, Tile.GRASS, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.GRASS, Tile.GRASS, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.GRASS, Tile.GRASS, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.GRASS, Tile.GRASS, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.GRASS, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE},
				 {Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE}
				 };
		
		Tile[][] StartMap = new Tile[][] {
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.FENCE, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.ENTERENCE, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE },
				{ Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.FENCE, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.DIRT, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.DIRT, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.DIRT, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.DIRT, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.DIRT, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.DIRT, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.DIRT, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.DIRT, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.DIRT, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT, Tile.DIRT,
						Tile.DIRT, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE },
				{ Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE,
						Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE, Tile.TREE } };
	
	

		Map map = new Map(cMap);
		Map enter = new Map(StartMap);
		System.out.println("Custom:");
		System.out.println(enter.toString());
		System.out.println("\n\n\n\n");

	}
}