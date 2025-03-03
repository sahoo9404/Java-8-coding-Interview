package coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestProgramMpha {

	public static void findMissingNumber(int[] array) {
		int min = Arrays.stream(array).min().orElseThrow();
		int max = Arrays.stream(array).max().orElseThrow();

		// Find missing numbers
		List<Integer> missingNumbers = IntStream.rangeClosed(min, max)
				.filter(num -> Arrays.stream(array).noneMatch(x -> x == num)).boxed().collect(Collectors.toList());

		// Print missing numbers
		System.out.println("Missing numbers: " + missingNumbers);
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 4, 4);

		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicate = list.stream().filter(e -> !unique.add(e)).collect(Collectors.toSet());
		System.out.println(duplicate);
		/*
		 * for (int i = 0; i < list.size(); i++) { if (i < list.size()-1) { int s =
		 * list.get(i + 1) - list.get(i); if (s != 1) {
		 * System.out.println("Missing number" + (i + 1)); } } }
		 */

		int[] a = { 1, 3, 2 };
		int[] b = { 4, 5, 6 };
		int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
		for (int n : c)
			System.out.print(n);
		System.out.println();
		int[] nums = { 1, 2, 4, 6, 9 };
		findMissingNumber(nums);
		Predicate<Integer> greaterThanTen = (i) -> i > 3;
		list.stream().filter(greaterThanTen).forEach(System.out::println);

	}

}
