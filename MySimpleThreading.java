class MyThread implements Runnable {
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println("Welcome to " + Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.getStackTrace();
			}
		}		
	}
}

class MySimpleThreading {
	public static void operateThreading() throws Exception {
		MyThread myThreadObject = new MyThread();
		
		Thread t1 = new Thread(myThreadObject);
		t1.start();
		t1.join();

		Thread t2 = new Thread(myThreadObject);
		t2.start();
		t2.join();
	}
}
