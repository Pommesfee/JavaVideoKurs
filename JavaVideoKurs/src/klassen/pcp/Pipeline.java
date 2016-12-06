package klassen.pcp;

public class Pipeline {

	private Object data = null;

	public synchronized void put(Object newData) {
		System.out.println("Producer " + Thread.currentThread().getName()
				+ " entered put() ...");
		while (data != null) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		data = newData;
		System.out.println("Producer " + Thread.currentThread().getName()
				+ " put data: " + data);
		this.notify();
	}
	
	public synchronized Object get() {
		System.out.println("Consumer entered get()...");
		while (data == null) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Object theData = data;
		System.out.println("Consumer retrieved data: " + theData);
		this.notify();
		return theData;
	}

}
