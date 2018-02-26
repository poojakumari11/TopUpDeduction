package worker;

public class Worker implements Runnable {

	private Integer number;

	public Worker(Integer number) {
		this.number = number;
	}

	@Override
	public void run() {

      System.out.println("Deducted "+number);
	}

}
