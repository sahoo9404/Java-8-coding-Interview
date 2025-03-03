package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		 ExecutorService executor = Executors.newFixedThreadPool(2);
		Callable<String> task = () -> {
            Thread.sleep(2000);
            return "Task Completed!";
        };
        
        Future<String> future = executor.submit(task);

        System.out.println("Task Submitted!");

        while (!future.isDone()) {
            System.out.println("Waiting for task...");
            Thread.sleep(500);
        }
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Executing Task " + taskId + " in " + Thread.currentThread().getName());
            });
        }
//        System.out.println("Result: " + future.get());

        executor.shutdown();
	}

}
