package views;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import controller.Game;
import items.Decision;
import pokemon.Pokemon;

@SuppressWarnings("serial")
public class GraphicView extends JPanel implements Observer {

	private boolean gameOver;
	private boolean battle;
	private boolean doneAnimation;

	private String pokeballCount;
	private String rockCount;

	private Game game;

	private BufferedImage tiles;
	private BufferedImage playerSpriteSheet;

	private JLabel steps;
	private JLabel items;
	private JLabel items1;

	private JLabel upperBox;
	private JLabel lowerBox;
	private JLabel leftBox;
	private JLabel rightBox;
	private JLabel moveLabel;

	private JLabel pokemonName, hp;

	private AudioClip safariAudio;
	private AudioClip battleAudio;

	private boolean itemThrown;
	private String item;
	private Image itemImage;
	private Timer timer;
	private boolean stop = false;
	private int x, y;
	
	private Image pokeball, rock, bait;

	public GraphicView(Game game) {
		this.game = game;

		gameOver = false;
		battle = false;

		steps = new JLabel("0");
		steps.setBounds(5, 5, 50, 20);

		upperBox = new JLabel("");
		lowerBox = new JLabel("");
		leftBox = new JLabel("");
		rightBox = new JLabel("");
		moveLabel = new JLabel("");

		pokeballCount = game.getItemStr();
		rockCount = game.getItemStr1();

		items = new JLabel(pokeballCount);
		items1 = new JLabel(rockCount);
		playSafariMusic();

		x = 150;
		y = 300;
		itemThrown = false;
		doneAnimation = false;
		timer = new Timer(5, new TimerListener());
		
		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		repaint();
	}

	public void paintComponent(Graphics graph) {
		Graphics2D minor = (Graphics2D) graph;
		draw(minor);
	}

	private void draw(Graphics2D g) {
		this.setBackground(Color.cyan);
		if (!battle)
			drawSafari(g);
		else
			drawBattle(g);
	}

	private void drawSafari(Graphics2D g) {
		this.removeAll();
		String file = "";
		String image = "";
		int width = 0;
		int height = 0;
		int xAxis = 0;
		int yAxis = 0;
		game.currentPokemon(0);
		String map = game.toStringView();
		for (int i = 0; i < map.length(); i++) {
			image = map.substring(i, i + 1);
			if (image.equals("\n") || image.equals(" ")) {
				if (image.equals("\n")) {
					yAxis++;
					width = xAxis;
					height = yAxis;
					xAxis = 0;
				}
			} else {
				if (image.equals("T")) {
					file = "images/tiles/tree.png";
				}
				if (image.equals("D")) {
					file = "images/tiles/grass.png";
				}
				if (image.equals("G")) {
					file = "images/tiles/grasspatch.png";
				}
				if (image.equals("F")) {
					file = "images/tiles/fence.png";
				}
				if (image.equals("E")) {
					file = "images/tiles/enterence.png";
				}
				try {
					tiles = ImageIO.read(new File(file));
				} catch (IOException e) {
					e.printStackTrace();
				}
				g.drawImage(tiles, (xAxis * 60) - 60, (yAxis * 60) - 60, 60, 60, null);
			}
			xAxis++;
		}

		image = "";
		int PlayerXLoc = (width / 2);
		int PlayerYLoc = (height / 2) + 1;
		playerSpriteSheet = game.getPlayerSprite();
		g.drawImage(playerSpriteSheet, (PlayerXLoc * 60) - 60, (PlayerYLoc * 60) - 60, 60, 60, null);

		steps.setText("Steps Walked: " + game.playerHasWalked());
		steps.setFont(new Font("Tahoma", Font.PLAIN, 20));
		steps.setHorizontalAlignment(SwingConstants.CENTER);
		steps.setForeground(Color.BLACK);
		steps.setBounds(520, 0, 240, 50);
		this.add(steps);

		items.setText(pokeballCount);
		items.setFont(new Font("Tahoma", Font.PLAIN, 20));
		items.setBounds(540, 50, 150, 40);
		this.add(items);

		items1.setText(rockCount);
		items1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		items1.setBounds(540, 90, 150, 40);
		this.add(items1);

		upperBox.setText("\u2191");
		upperBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		upperBox.setLocation(638, 440);
		upperBox.setSize(40, 40);
		this.add(upperBox);

		lowerBox.setText("\u2193");
		lowerBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lowerBox.setLocation(638, 480);
		lowerBox.setSize(40, 40);
		this.add(lowerBox);

		leftBox.setText("\u2190");
		leftBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		leftBox.setLocation(598, 480);
		leftBox.setSize(40, 40);
		this.add(leftBox);

		rightBox.setText("\u2192");
		rightBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rightBox.setLocation(678, 480);
		rightBox.setSize(40, 40);
		this.add(rightBox);
		//
		moveLabel.setText("<html>Use arrow keys from<br> keyboard to navigate</html>");
		moveLabel.setLocation(578, 320);
		moveLabel.setSize(200, 200);
		this.add(moveLabel);

		g.draw(new Rectangle(625, 440, 40, 40));
		g.draw(new Rectangle(625, 480, 40, 40));
		g.draw(new Rectangle(585, 480, 40, 40));
		g.draw(new Rectangle(665, 480, 40, 40));

		if (gameOver) {
			Font aFont = new Font("Comic Sans", Font.BOLD, 60);
			g.setFont(aFont);
			g.setPaint(Color.BLACK);
			g.drawString("Game Over", 120, 100);
		}
	}
	
	private void drawBattle(Graphics2D g) {
		this.removeAll();
		Image background = null;
		try {
			background = ImageIO.read(new File("images/battle_background.png"));
			if (game.currentPokemon(2) == null) {
				game.currentPokemon(1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		g.drawImage(background, 0, 0, 535, 538, null, null);

		Pokemon pokemon = game.currentPokemon(2);
		g.drawImage(pokemon.getBattleImage(), 350, 170, null);

		pokemonName = new JLabel(pokemon.getName());
		pokemonName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pokemonName.setHorizontalAlignment(SwingConstants.CENTER);
		pokemonName.setForeground(Color.BLACK);
		pokemonName.setBounds(0, 25, 200, 50);
		this.add(pokemonName);

		Image hpBar = null;
		try {
			hpBar = ImageIO.read(new File("images/healthbar/100%.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g.drawImage(hpBar, 30, 60, null);

		hp = new JLabel("HP: " + pokemon.getHPBar().toString());
		hp.setFont(new Font("Tahoma", Font.PLAIN, 16));
		hp.setHorizontalAlignment(SwingConstants.CENTER);
		hp.setForeground(Color.BLACK);
		hp.setBounds(50, 70, 200, 50);
		hp.setHorizontalAlignment(SwingConstants.LEFT);
		this.add(hp);

		try {
			pokeball =  ImageIO.read(new File("images/items/pokeball.png"));
			bait = ImageIO.read(new File("images/items/bait.png"));
			rock = ImageIO.read(new File("images/items/rock.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		g.drawImage(pokeball, 550, 300, 40, 40, null, null);
		g.drawImage(bait, 550, 350, 40, 40, null, null);
		g.drawImage(rock, 550, 400, 40, 40, null, null);
		
		g.drawString("Press P", 600, 325);
		g.drawString("Press B", 600, 375);
		g.drawString("Press R", 600, 425);
		g.drawString("Press Space Bar to Run!", 550, 475);
		
		
		Image trainer = null;
		try {
			trainer = ImageIO.read(new File("images/tiles/pikachu.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		g.drawImage(trainer, 0, 220, null);

		if (itemThrown) {
			animateThrow(g, item);
			doneAnimation = true;
		}

	}

	private synchronized void playBattleMusic() {
		battleAudio = null;
		URL url = null;

		String baseFolder = "file:";

		try {
			url = new URL(baseFolder + "music/battle_music.wav");
			battleAudio = Applet.newAudioClip(url);
		} catch (MalformedURLException e) {
			System.out.println("Bad file path: " + url);
		}

		battleAudio.loop();
	}

	public synchronized void playSafariMusic() {
		safariAudio = null;
		URL url = null;

		String baseFolder = "file:";

		try {
			url = new URL(baseFolder + "music/safari_music.wav");
			safariAudio = Applet.newAudioClip(url);
		} catch (MalformedURLException e) {
			System.out.println("Bad file path: " + url);
		}

		safariAudio.loop();
	}

	private void engageBattle() {
		safariAudio.stop();
		playBattleMusic();
		battle = true;
		this.battle = true;
		game.checkBattle(1);
	}

	private void disengageBattle() {
		battleAudio.stop();
		playSafariMusic();
		battle = false;
		this.battle = false;
		game.checkBattle(0);
	}

	public class ArrowKeyListener implements KeyListener {

		private long lastPressed = 0;
		private int speed = 200;

		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent key) {
			if (!battle) {
				if (key.getKeyCode() == KeyEvent.VK_SHIFT) {
					speed = 100;
				}

				if (System.currentTimeMillis() - lastPressed > speed) {
					boolean moved = false;

					if (game.Over()) {
						if (key.getKeyCode() == KeyEvent.VK_UP) {

							moved = game.movePlayerLocation(-1, 0);
							game.movePlayerDirection("North", moved);
						}
						if (key.getKeyCode() == KeyEvent.VK_DOWN) {
							// System.out.println("s");
							moved = game.movePlayerLocation(1, 0);
							game.movePlayerDirection("South", moved);

						}
						if (key.getKeyCode() == KeyEvent.VK_RIGHT) {
							moved = game.movePlayerLocation(0, 1);
							game.movePlayerDirection("East", moved);

						}
						if (key.getKeyCode() == KeyEvent.VK_LEFT) {
							moved = game.movePlayerLocation(0, -1);
							game.movePlayerDirection("West", moved);
						}

					} else {
						game.movePlayerLocation(0, 0);
						gameOver = true;
					}
					if (!game.enterDoor() && game.checkForPokemon()) {
						engageBattle();
					}
					lastPressed = System.currentTimeMillis();
				}
				repaint();
			}

			else {
				x = 150;
				y = 300;
				stop = false;
				Decision pokemonDecision = null;
				if (key.getKeyChar() == 'p' || key.getKeyChar() == 'P') {
					pokemonDecision = game.battle("throw ball", game.currentPokemon(2));
					playThrowSound();
					item = "pokeball";
					itemThrown = true;
					try {
						itemImage = ImageIO.read(new File("images/items/pokeball.png"));
					} catch (IOException e1) {
						e1.printStackTrace();
					}

				}
				if (key.getKeyChar() == 'r' || key.getKeyChar() == 'R') {
					pokemonDecision = game.battle("throw rock", game.currentPokemon(2));
					playThrowSound();
					item = "rock";
					itemThrown = true;
					try {
						itemImage = ImageIO.read(new File("images/items/rock.png"));
					} catch (IOException e1) {
						e1.printStackTrace();
					}

				}
				if (key.getKeyChar() == 'b' || key.getKeyChar() == 'B') {
					pokemonDecision = game.battle("throw bait", game.currentPokemon(2));
					playThrowSound();
					item = "bait";
					itemThrown = true;
					try {
						itemImage = ImageIO.read(new File("images/items/bait.png"));
					} catch (IOException e1) {
						e1.printStackTrace();
					}

				}
				if (key.getKeyCode() == KeyEvent.VK_SPACE) {
					playRunSound();
					disengageBattle();
				}

				repaint();
				if (doneAnimation) {
					//
					if (pokemonDecision == Decision.Caught) {
						System.out.println("Caught");
						game.checkBattle(0);
						disengageBattle();
					}

					if (pokemonDecision == Decision.Run) {
						System.out.println("Ran Away");
						disengageBattle();
						game.checkBattle(0);
					}

					if (pokemonDecision == Decision.Stay) {
						System.out.println("Still here");
					}
					doneAnimation = false;
					repaint();

				}
			}
		}

		@Override
		public void keyReleased(KeyEvent key) {
			if (key.getKeyCode() == KeyEvent.VK_SHIFT) {
				speed = 200;
			}
		}
	}

	private synchronized void animateThrow(Graphics2D g, String item) {
		g.drawImage(itemImage, x, y, null);
		timer.start();
	}

	private void playThrowSound() {
		AudioClip sound = null;
		URL url = null;

		String baseFolder = "file:";

		try {
			url = new URL(baseFolder + "soundeffects/throw.wav");
			sound = Applet.newAudioClip(url);
		} catch (MalformedURLException e) {
			System.out.println("Bad file path: " + url);
		}

		sound.play();
	}

	private void playRunSound() {
		AudioClip sound = null;
		URL url = null;

		String baseFolder = "file:";

		try {
			url = new URL(baseFolder + "soundeffects/runaway.wav");
			sound = Applet.newAudioClip(url);
		} catch (MalformedURLException e) {
			System.out.println("Bad file path: " + url);
		}

		sound.play();
	}

	private class TimerListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (x <= 330)
				x += 10;
			if (y >= 90) {
				if (stop)
					itemThrown = false;
				else
					y -= 10;
			} else {
				if (y <= 150) {
					y += 10;
					stop = true;
				}
			}
			repaint();
		}
	}
}