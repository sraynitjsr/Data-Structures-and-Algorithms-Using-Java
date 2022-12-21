package github.com.sraynitjsr;

class Resource implements Runnable {
	private static int val = 1;
	public void run() {
		while (val < 20) {
			try {
				print();
				Thread.sleep(100);
			} catch (Exception e) {}
		}
	}
	private synchronized static void print() throws Exception {
		if (val%2 == 0) {
			System.out.println("Even " + val++ + " from thread " + Thread.currentThread().getName());	
		} else {
			System.out.println("Odd " + val++ + " from thread " + Thread.currentThread().getName());
		}		
	}
}
public class MyMultiThreadingSharedResource {
	public static void operateMultiThreading() throws Exception {
		Resource r1 = new Resource();
		Resource r2 = new Resource();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();		
		t2.start();

		t1.join();
		t2.join();
	}
}
