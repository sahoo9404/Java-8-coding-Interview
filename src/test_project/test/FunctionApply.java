package test_project.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionApply {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		Function<String, String> toLowercase = str -> str.toLowerCase();
		listOfStrings.stream().map(toLowercase).sorted().forEach(System.out::println);

		List<String> names = Arrays.asList("Alice", "Bob");
		List<Integer> numbers = Arrays.asList(1, 2, 3);
		// BiFunction to create a pair
		BiFunction<String, Integer, String> pair = (name, number) -> name + "-" + number;

		// Use flatMap() to combine names and numbers
		List<String> result = names.stream().flatMap(name -> numbers.stream().map(number -> pair.apply(name, number)))
				.collect(Collectors.toList());
	}

}
