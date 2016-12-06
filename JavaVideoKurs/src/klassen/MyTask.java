package klassen;

import java.util.Random;

public class MyTask implements Runnable {

	private boolean running;

	@Override
	public void run() {
		long start = System.currentTimeMillis();

		int bestMove = Integer.MIN_VALUE;
		Random random = new Random();
		running = true;
		for (int i = 1; i <= 100; i++) {
			for (int j = 0; j < 2000; j++) {
				for (int k = 0; k < 2000; k++) {
					synchronized (this) {
						if (!running) {
							System.out.println("Thread wird beendet... !");
							return;
						}
						int move = random.nextInt();
						if (move > bestMove) {
							bestMove = move;
						}
					}
				}
			}
			System.out.println("Thinking... " + i + "%");
		}

		long stop = System.currentTimeMillis();
		long time = stop - start;
		System.out.println(Thread.currentThread().getName()
				+ " FINISHED AFTER " + time / 1000. + " seconds.");
	}

	public synchronized void cancel() {
		//synchronized (this) {
			running = false;
		//}
	}

}
