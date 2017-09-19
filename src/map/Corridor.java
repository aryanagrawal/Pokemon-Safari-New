package map;

import java.io.Serializable;

public class Corridor  implements Serializable {
	

	public void Connect(Room from, Room to, Tile[][] board) {
		int FromXCenter = from.findXCenter();
		int FromYCenter = from.findYCenter();
		
		int ToXCenter = to.findXCenter();
		int ToYCenter = to.findYCenter();
		
		int startX = FromXCenter;
		int startY = FromYCenter;
		
		IntRange corridorRange = new IntRange(1, 5);
		int width = corridorRange.RandomRange();
		
		while(startX!=ToXCenter){//sets a path on the X axis
			if(startX<ToXCenter){
				int temp = startY;
				temp -= width/2;
				for (int i = 0; i < width; i++) {
					board[startX][temp++] = Tile.DIRT;
				}
				startX++;
			} else {
				int temp = startY;
				temp -= width/2;
				for (int i = 0; i < width; i++) {
					board[startX][temp++] = Tile.DIRT;
				}
				startX--;
			}
		}
		
		while(startY!=ToYCenter){ //sets a path on the Y axis
			if(startY<ToYCenter){
				int temp = startX;
				temp -= width/2;
				for (int i = 0; i < width; i++) {
					board[temp++][startY] = Tile.DIRT;
				}
				startY++;
			} else {
				int temp = startX;
				temp -= width/2;
				for (int i = 0; i < width; i++) {
					board[temp++][startY] = Tile.DIRT;
				}
				startY--;
			}
		}
		
		
	}

}
