package programme;

public class CrazyThreads2 implements Runnable {

	int x;

	@Override
	public void run() {
		int i;
		for (i = 0; i < 2000; i++) {
			x++;
		}
		System.out.println(Thread.currentThread().getName()
				+ " has finished after " + i + " loops");
	}

	public static void main(String[] args) {

		CrazyThreads2 c = new CrazyThreads2();
		new Thread(c).start();
		new Thread(c).start();

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("x is: " + c.x);
	}

}
