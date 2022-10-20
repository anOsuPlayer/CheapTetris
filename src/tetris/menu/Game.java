package tetris.menu;

import javax.swing.*;

import tetris.util.Screen;
import static tetris.util.Consts.*;

public class Game {

	public static final JFrame window = new JFrame();
	
	public static final JLayeredPane scene = window.getLayeredPane();
	
	public static final MainMenu mainMenu = new MainMenu();
	
	public static void main(String[] args) {
		new Game();
	}
	
	private void start() {
		window.setTitle("Tetris");
		window.setSize(WIDTH, HEIGHT);
		window.setLocation(Screen.getScreenX() / 2 - window.getWidth() / 2, 
				Screen.getScreenY() / 2 - window.getHeight() / 2);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		scene.add(mainMenu, 1, 1);
	}
	
	private void update() {
		
	}
	
	private Game() {
		this.start();
		this.update();
	}
}
