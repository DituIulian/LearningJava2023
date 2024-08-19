package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {
	private int number;

	public Task(int number) {
		this.number = number;
	}

	@Override
	public void run() { // Signature

		System.out.print("\nTask" + number + "started \n");
		for (int i = number * 100; i <= number * 100 + 99; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask" + number + " is done \n");
	}
}

public class ExecuterServiceRunner {

	public static void main(String[] args) {
		// ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(4);

		// executorService.execute(new Task1());
		// executorService.execute(new Thread(new Task2()));
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));

		/*
		 * System.out.print("\nTask 3 started \n"); for (int i = 301; i <= 399; i++) {
		 * System.out.print(i + " "); }
		 * 
		 * System.out.print("\nTask 3 is done\n");
		 * 
		 * System.out.println(" \nMain Done");
		 */
		executorService.shutdown();
	}

}
