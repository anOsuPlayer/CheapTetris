package tetris.menu;

import java.awt.*;
import javax.swing.*;

import tetris.util.Consts;

import static tetris.util.Consts.*;

public class MainMenu extends JPanel {

	private static final long serialVersionUID = 2L;

	private static final JLabel title = new JLabel("Tetris");
	private static final JLabel subtitle = new JLabel("(but it's the cheap copy.)");
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.fillRect(0, 0, Consts.WIDTH, Consts.HEIGHT);
	}
	
	private void initialize() {
		this.setLayout(null);
		
		title.setBounds(0, 0, Consts.WIDTH, Consts.HEIGHT / 3);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setForeground(Color.white);
		title.setFont(defFont(100));
		this.add(title);
		
		subtitle.setBounds(0, 70, Consts.WIDTH, Consts.HEIGHT / 3);
		subtitle.setHorizontalAlignment(SwingConstants.CENTER);
		subtitle.setForeground(Color.white);
		subtitle.setFont(defFont(40));
		this.add(subtitle);
	}
	
	public MainMenu() {
		this.setBounds(0, 0, Consts.WIDTH, Consts.HEIGHT);
		this.setVisible(true);
		this.initialize();
	}
}
