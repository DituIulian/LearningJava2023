package threads;
//extends Threads
//implements Runnable

class Task1 extends Thread {
	@Override
	public void run() { // Signature

		System.out.print("\nTask 1 started \n");
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}


		System.out.print("\nTask 1 is done \n");
	}
}

class Task2 implements Runnable {
	@Override
	public void run() {

		System.out.print("\nTask 2 started \n");
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask 2 is done\n");

	}



}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {

		// task1
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();

		// wait for task1 to complete
		task1.join();

		// task2
		Task2 task2 = new Task2();

		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();
		task2Thread.join();

		// task3
		System.out.print("\nTask 3 started \n");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}


		System.out.print("\nTask 3 is done\n");

		System.out.println(" \nMain Done");
	}
}
