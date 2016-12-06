package programme;

import klassen.pcp.Consumer;
import klassen.pcp.Pipeline;
import klassen.pcp.Producer;

public class ProducerConsumerDemo {

	public static void main(String[] args) {

		Pipeline pipeline = new Pipeline();

		Producer p1 = new Producer(pipeline);
		Producer p2 = new Producer(pipeline);
		Producer p3 = new Producer(pipeline);
		Consumer c = new Consumer(pipeline);
		
		new Thread(p1).start();
		new Thread(p2).start();
		new Thread(p3).start();
		new Thread(c).start();
	}

}
