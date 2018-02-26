package worker;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerManager {

	public void startDeduction(Integer number) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		executorService.execute(new Worker(number) );
		
		executorService.shutdown();
		
	}
}
