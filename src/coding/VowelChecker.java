package coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VowelChecker {// HCL

	public static void main(String[] args) {
		String input = "Hello, how are you?";

		// List of vowels
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

		// Find vowels in the string
		List<Character> foundVowels = input.chars() // Convert to IntStream
				.mapToObj(c -> (char) c) // Convert int to char
				.filter(vowels::contains) // Filter only vowels
				.collect(Collectors.toList()); // Collect to List

		System.out.println("Vowels in the string: " + foundVowels);
	}

}
