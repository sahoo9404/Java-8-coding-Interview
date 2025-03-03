package coding;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Nisum Technology
public class Test3 {

	private static boolean isPrime(int number) {
		if (number <= 1)
			return false;
		return java.util.stream.IntStream.rangeClosed(2, (int) Math.sqrt(number))
				.noneMatch(divisor -> number % divisor == 0);

	}

	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		int	balance = scn.nextInt();
		int[] numbers = { 2, 3, 4, 5, 10, 13, 17, 19, 22, 23 };
		int[] primes = Arrays.stream(numbers).filter(Test3::isPrime).toArray();
		for (int prime : primes)
			System.out.println(prime);

	}

}
