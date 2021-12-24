package task2b;

public class Printer implements Runnable {

	static int counter = 1;
	int checker;
	static Object lock = new Object();

	Printer(int checker) {
		this.checker = checker;
	}

	public void printer() {

		System.out.println(Thread.currentThread().getName() + " " + counter++);
	}

	public void run() {

		for (int i = 0; i < 10; i++) {
			synchronized (lock) {

				while (counter % 2 != checker) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				printer();
				lock.notifyAll();

			}
		}
	}

}
