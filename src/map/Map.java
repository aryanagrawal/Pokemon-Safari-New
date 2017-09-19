package map;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Map implements Serializable {
	public static final String FILE_NAME = "Map.srp";
	private int height;
	private int width;
	private int rooms;
	private int playerX;
	private int playerY;
	private int startLocX;
	private int startLocY;
	IntRange roomRange;
	IntRange boardRange;
	private Tile[][] board;
	private Room[] Rooms;

	public Map(Tile[][] board) {
		this.board = board;
		this.height = board.length; // height of the map
		this.width = board[0].length;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j].toChar() == 'E') {
					playerX = i;
					playerY = j + 1;
					startLocX = playerX;
					startLocY = playerY;
				}
			}
		}
	}

	public Map(int length, int rooms) {
		this.height = length; // height of the map
		this.width = length;
		this.rooms = rooms; // how many rooms will spawn in the map
		roomRange = new IntRange(3, 30);
		boardRange = new IntRange(4, length - 4);
		if (height < 34 && width < 34 && rooms >= 1) {
			System.err.println("The height and width needs to be bigger for that amount of rooms.");
			throw new MapSpaceException();
		}
		Rooms = new Room[rooms];
		board = new Tile[width][height];
		generateBoard();
	}

	public Map(int length, int rooms, int minRoomSize, int maxRoomSize) {
		this.height = length; // height of the map
		this.width = length;
		this.rooms = rooms; // how many rooms will spawn in the map
		roomRange = new IntRange(minRoomSize, maxRoomSize + 1);
		boardRange = new IntRange(4, length - 4);
		if (height < maxRoomSize + 4 && width < maxRoomSize + 4 || maxRoomSize < minRoomSize) {
			if (height < maxRoomSize + 4 && width < maxRoomSize + 4) {
				System.err.println("Error: The rooms max size is to big for the board size.\n"
						+ "----> Either increase board size or reduce room size.");
			}
			if (maxRoomSize < minRoomSize) {
				System.err.println("Error: The maxRoomSize is smaller then the minRoomSize");
			}
			throw new MapSpaceException();
		}
		Rooms = new Room[rooms];
		board = new Tile[width][height];
		generateBoard();
	}

	private void generateBoard() {
		setBase();
		setRoomsNCorridors();
		wallOff();
		setPlayer();
		setPlayerEnterence();
	}

	private void setBase() {
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				board[i][j] = Tile.TREE;
			}
		}
	}

	private void setRoomsNCorridors() {
		for (int i = 0; i < rooms; i++) {
			Rooms[i] = new Room(roomRange, boardRange, board.length);
			int xAxis = Rooms[i].xStartCord();
			int yAxis = Rooms[i].yStartCord();
			IntRange GrassRange = new IntRange(1, 7);
			for (int w = xAxis; w < Rooms[i].getWidth() + xAxis; w++) {
				for (int h = yAxis; h < Rooms[i].getHeight() + yAxis; h++) {
					if (w % GrassRange.RandomRange() == 0 && h % GrassRange.RandomRange() == 0
							|| GrassRange.RandomRange() % 6 == 0) {
						board[w][h] = Tile.GRASS;
					} else {
						board[w][h] = Tile.DIRT;
					}
				}
			}
		}
		if (rooms > 1) {
			Corridor corridor = new Corridor();
			for (int i = 1; i < rooms; i++) {
				Room from = Rooms[i - 1];
				Room to = Rooms[i];
				corridor.Connect(from, to, board);
			}
		}
	}

	private void wallOff() {
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				if (i < 4 || i > board.length - 5 || j < 4 || j > board[0].length - 5)
					board[i][j] = Tile.TREE;
			}
		}
	}

	private void setPlayer() {
		boolean exit = false;
		for (int i = board[0].length - 1; 0 < i; i--) {
			for (int j = board.length - 1; 0 < j; j--) {
				if (board[j][i] != Tile.TREE) {
					// board[j][i] = Tile.PLAYER;
					playerX = j;
					playerY = i;
					startLocX = j - 1;
					startLocY = i;
					exit = true;
					break;
				}
				if (exit == true) {
					break;
				}
			}
		}
	}

	private void setPlayerEnterence() {
		playerX -= 1;
		int gateX = playerX;
		int gateY = playerY + 1;
		board[gateX - 1][gateY] = Tile.FENCE;
		board[gateX][gateY] = Tile.ENTERENCE;
		board[gateX + 1][gateY] = Tile.FENCE;
		for (int i = gateX - 1; i <= gateX + 1; i++) {
			for (int j = gateY + 1; j < board.length; j++) {
				board[i][j] = Tile.DIRT;
			}
		}
	}

	// Returns the tile type that the player is currently on.
	public Tile getPlayerTile() {
		return board[playerX][playerY];
	}

	public int PlayerXStart() {
		return playerX;
	}

	public int PlayerYStart() {
		return playerY;
	}

	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < width; i++) {
			result += "\n";
			for (int j = 0; j < height; j++) {
				result += " " + board[i][j].toChar();
			}
		}
		return result;
	}

	public String toStringView() {
		String result = "";
		for (int i = playerX - 4; i <= playerX + 4; i++) {
			result += "\n";
			for (int j = playerY - 4; j <= playerY + 4; j++) {
				result += board[i][j].toChar();
			}
		}
		return result;
	}

	public boolean move(int xAxis, int yAxis) {
		boolean moved = false;

		char block;
		if (xAxis != 0) {
			block = board[playerX + xAxis][playerY].toChar();
			if (block != Tile.TREE.toChar() && block != Tile.FENCE.toChar()) {
				playerX += xAxis;
				moved = true;
			}
		} else {
			block = board[playerX][playerY + yAxis].toChar();
			if (block != Tile.TREE.toChar() && block != Tile.FENCE.toChar()) {
				playerY += yAxis;
				moved = true;
			}
		}
		return moved;
	}

	public void setPlayersLocation() {
		playerX = startLocX;
		playerY = startLocY;
	}
}