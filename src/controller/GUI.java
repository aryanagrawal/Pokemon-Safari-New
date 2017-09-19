package controller;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import views.GraphicView;

public class GUI extends JFrame {

	private GraphicView graphicView;
	private boolean set = false;
	private Game game;
	private JPanel currentView;
	private String type;
	private String winCondition;

	private static final int WINDOW_X = 350;
	private static final int WINDOW_Y = 80;

	private static final int WINDOW_WIDTH = 745;
	private static final int WINDOW_HEIGHT = 568;

	public GUI() {
		windowActions();
		start();
		setFrame();
		this.addKeyListener(graphicView.new ArrowKeyListener());
	}

	public static void main(String[] args) {
		GUI gui = new GUI();
		gui.setVisible(true);
	}

	private void saveForPersistentVersion() {
		FileOutputStream bytesToDisk = null;
		try {
			// makes and output stream
			bytesToDisk = new FileOutputStream(Game.FILE_NAME);
			ObjectOutputStream outGameMap = new ObjectOutputStream(bytesToDisk);
			outGameMap.writeObject(game); // writes the object
			outGameMap.close(); // closes the output stream

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void end() {
		if (!game.inBattle()) {
			int decision = JOptionPane.showConfirmDialog(null, "Save game data?");
			if (decision == JOptionPane.YES_OPTION) {
				saveForPersistentVersion(); // saves the objects
				System.exit(0); // exits
			} else if (decision == JOptionPane.NO_OPTION) {
				System.exit(0); // exits
			} else {
				// Doesn't close
				this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
			}
		} else
			this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	private void windowActions() {
		this.addWindowListener(new WindowListener() {

			@Override
			public void windowActivated(WindowEvent arg0) {

			}

			@Override
			public void windowClosed(WindowEvent arg0) {

			}

			@Override
			public void windowClosing(WindowEvent arg0) { // if the window is
															// closing it runs
															// end.
				end();
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {

			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {

			}

			@Override
			public void windowIconified(WindowEvent arg0) {

			}

			@Override
			public void windowOpened(WindowEvent arg0) {

			}

		});// window listners
	}

	private void startWithPersistentVersion() {
		try {
			ObjectInputStream inGameFile = new ObjectInputStream(new FileInputStream(Game.FILE_NAME));
			game = (Game) inGameFile.readObject();
			inGameFile.close(); // closes the ObjectInputStream
			game.loadImages();
		} catch (Exception e) {
			Object[] options = { "Pikachu", "Lucario" };
			int n = JOptionPane.showOptionDialog(null, "Which pokemon do you want to be?", "Select your pokemon", 0, 0,
					null, options, null);
			if (n == 0) {
				type = (String) options[0];
			} else {
				type = (String) options[1];
			}
			Object[] wins = { "500 Steps", "Run Out Of Pokeballs" };
			int m = JOptionPane.showOptionDialog(null, "How do you want to win?", "Select your path!", 0, 0, null, wins,
					null);
			if (m == 0) {
				winCondition = (String) wins[0];
			} else {
				winCondition = (String) wins[1];
			}
			setModels(type, winCondition); // if they don't use the save
		}
		set = true; // if set is equal to true then it wont run setModels
	}

	private void setModels(String pokemonType, String winCondition) {
		if (!set) {
			game = new Game(pokemonType, winCondition);
			graphicView = new GraphicView(game);
			currentView = graphicView;
		} else {
			graphicView = new GraphicView(game);
		}
	}

	private void start() {
		type = null;
		int decision = JOptionPane.showConfirmDialog(null, "Start with where you were last time?");
		if (decision == JOptionPane.YES_OPTION) {
			startWithPersistentVersion(); // if they start with save
			setModels(type, winCondition); // to set the view
		} else if (decision == JOptionPane.NO_OPTION) {
			Object[] options = { "Pikachu", "Lucario" };
			int n = JOptionPane.showOptionDialog(null, "Which pokemon do you want to be?", "Select your pokemon", 0, 0,
					null, options, null);
			if (n == 0) {
				type = (String) options[0];
			} else {
				type = (String) options[1];
			}
			Object[] wins = { "500 Steps", "Run Out Of Pokeballs" };
			int m = JOptionPane.showOptionDialog(null, "How do you want to win?", "Select your path!", 0, 0, null, wins,
					null);
			if (m == 0) {
				winCondition = (String) wins[0];
			} else {
				winCondition = (String) wins[1];
			}
			setModels(type, winCondition); // if they don't use the save
		} else {
			// When click "cancel" then the program just exit
			System.exit(0); // if they cancel
		}
	}

	private void setViewTo(JPanel newView) {
		if (currentView != null)
			remove(currentView);
		currentView = newView;
		add(currentView);
		currentView.repaint();
		validate();
	}

	private void setFrame() {
		this.setTitle("Pokemon Safari!");
		this.setLocation(WINDOW_X, WINDOW_Y);
		this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("images/items/pokeball.png"));
		this.setResizable(false);
		setViewTo(graphicView);
		game.addObserver((Observer) graphicView);
	}
}
