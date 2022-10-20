package tetris.util;

import java.awt.Toolkit;

public class Screen {

	public static final int getScreenX() {
		return (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	}
	
	public static final int getScreenY() {
		return (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	}
	
	private Screen() {
	}
}
