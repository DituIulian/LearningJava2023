package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {

	private int i = 0;
	private int j = 0;

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	public void incrementI() {
		// Get Lock for I
		lockForI.lock();
		i++;

		// Release Lock for I
		lockForI.unlock();
	}

	public int getI() {
		return i;
	}

	public void incrementJ() {
		// Get Lock for J
		lockForJ.lock();
		j++;

		// Release Lock for J
		lockForJ.unlock();
	}

	public int getj() {
		return j;
	}
}
