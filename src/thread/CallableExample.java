package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return 10 + 20;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<Integer> task = new CallableExample();
		ExecutorService executor = Executors.newFixedThreadPool(3);
		Future<Integer> future = executor.submit(task);
		System.out.println("Result: " + future.get());
		executor.shutdown();
	}

}
