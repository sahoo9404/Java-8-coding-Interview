package thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(2000); // Simulating a long-running task
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Hello, CompletableFuture!";
		});
		future.thenAccept(result -> {
			System.out.println("Received result: " + result);
		});
//		future.get();  // Blocks until completion

		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello, World!");
//        System.out.println(future1.get());

		// Runs a task asynchronously without returning a result.
		CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
			System.out.println("Task running asynchronously");
		});
		future2.get();
		// Transforms the result of a previous stage and returns a new value.
		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "Hello")
				.thenApply(result -> result + " World");
		System.out.println(future3.get()); // Output: Hello World
		//Consumes the result without returning a value.
		CompletableFuture.supplyAsync(() -> "Hello")
        .thenAccept(result -> System.out.println("Processed: " + result));
		//Runs a task after completion but does not receive the result.
		CompletableFuture.supplyAsync(() -> "Task Done")
        .thenRun(() -> System.out.println("Next Task Running"));
	}

}
