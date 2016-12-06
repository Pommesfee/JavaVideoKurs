package programme;

import klassen.MyTask;

public class MultiThreadingDemo {

	public static void main(String[] args) {

//		int threads = 8;
//	
//		for (int i = 1; i <= threads; i++) {
//			MyTask t = new MyTask();
//			Thread thread = new Thread(t);
//			thread.start();	
//		}
		
		MyTask t = new MyTask();
		new Thread(t).start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t.cancel();
	}
}
