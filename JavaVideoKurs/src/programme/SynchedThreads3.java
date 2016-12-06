package programme;

public class SynchedThreads3 implements Runnable {

	int x;

	@Override
	public void run() {
		int loops = 0;
		while (true) {
			synchronized (this) {
				if (x < 10000) {
					x++; // x = x + 1
					loops++;
				} else {
					break;
				}
			}
		}
		System.out.println(Thread.currentThread().getName()
				+ " has finished after " + loops + " loops");
	}

	public static void main(String[] args) {

		SynchedThreads3 a = new SynchedThreads3();
		new Thread(a).start();
		new Thread(a).start();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		synchronized (a) {
			System.out.println("X is: " + a.x);
		}
	}

}
