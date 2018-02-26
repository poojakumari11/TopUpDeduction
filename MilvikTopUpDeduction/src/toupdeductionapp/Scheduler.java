package toupdeductionapp;

import java.util.concurrent.BlockingQueue;

import worker.WorkerManager;

public class Scheduler implements Runnable {

	private BlockingQueue<Integer> queue;
	WorkerManager workmanager;
	

	public Scheduler(BlockingQueue<Integer> queue) {
		this.queue = queue;
		workmanager=new WorkerManager();
	}

	@Override
	public void run() {
		try {

			while (true) {
				Integer number = queue.take();

				if (number == null || number == -1) {
					break;
				}

				consume(number);

				Thread.sleep(1000);
			}

			System.out.println("scheduler stopped processing requests.");
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

	}
	
	private void consume(Integer number) {

		System.out.println("processing number <= " + number);
		workmanager.startDeduction(number);
		
		

	}

}
