package game.main;

public class MainThread implements Runnable {

	private Thread thread;
	private boolean running = false;

	public MainThread() {
		thread = new Thread(this);
		thread.start();
		running = true;

	}

	public void stop() {

		try {
			running = false;

			thread.join();
			thread.interrupt();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (running) {
			System.out.println("Working");
		}
		
	}

}
