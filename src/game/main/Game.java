package game.main;

import java.awt.Canvas;

public class Game extends Canvas {

	private static final long serialVersionUID = 852753996046178928L;

	public static final int WIDTH = 1080, HEIGHT = 720;

	public Game() {
		new Window(WIDTH, HEIGHT, "DodgeBall", this);
	}

	public void start() {

	}

}
