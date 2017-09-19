package map;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Room  implements Serializable {
	private int height;
	private int width;
	private int xStartCord;
	private int yStartCord;
	private IntRange boardRange;
	private int boardLength;

	public Room(IntRange roomRange, IntRange boardRange, int length) {
		height = roomRange.RandomRange();
		width = roomRange.RandomRange();
		this.boardRange = boardRange;
		boardLength = length;
		chooseLocation();
	}

	private void chooseLocation() {
		xStartCord = boardRange.RandomRange();
		while (xStartCord + width > boardLength) {
			xStartCord = boardRange.RandomRange();
		}
		yStartCord = boardRange.RandomRange();
		while (yStartCord + height > boardLength) {
			yStartCord = boardRange.RandomRange();
		}
	}
	public int xStartCord() {
		return xStartCord;
	}
	public int yStartCord() {
		return yStartCord;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	public int findXCenter() {
		return xStartCord + (width/2);
	}
	public int findYCenter() {
		return yStartCord + (height/2);
	}
}
