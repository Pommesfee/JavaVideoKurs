package programme;

public class SynchedThreads1 implements Runnable {

	boolean alive;
	long i;

	@Override
	public void run() {
		System.out.println("Thread starts...");
		i = 0;
		alive = true;
		while (true) {
			synchronized (this) {
				if (alive) {
					i++;
				} else {
					break;
				}
			}
		}
		System.out.println("Thread ends...");
	}

	public static void main(String[] args) {

		SynchedThreads1 c = new SynchedThreads1();
		new Thread(c).start();

		while (Thread.activeCount() > 1) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			long iNow;
			synchronized (c) {
			iNow = c.i;
			}
			System.out.println(iNow);
			if (iNow >= LIMIT) {
				synchronized (c) {
				c.alive = false;
				}
				System.out.println("THREAD STOPPED! (alive = " + c.alive + ")");
				
			}
		}
		System.out.println("Programm exits...");
	}

	private static final long LIMIT = 300000000L; // 3 Millarden
}
