package programme;

public class SynchedThreads2 implements Runnable {

	int x;

	@Override
	public void run() {
		int i;
		for (i = 0; i < 2000; i++) {
			synchronized (this) {
				x++;
			}
		}
		System.out.println(Thread.currentThread().getName()
				+ " has finished after " + i + " loops");
	}

	public static void main(String[] args) {

		SynchedThreads2 c = new SynchedThreads2();
		new Thread(c).start();
		new Thread(c).start();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (c) {
			System.out.println("x is: " + c.x);
		}
	}

}
