package main;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import toupdeductionapp.Listener;
import toupdeductionapp.Scheduler;

public class AppLaunher {

	public static void main(String[] args) {
		
		 	BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
		 
	        Thread producer = new Thread(new Listener(queue));
	 
	        Thread consumer = new Thread(new Scheduler(queue));
	 
	        producer.start();
	        consumer.start();
	}
}
