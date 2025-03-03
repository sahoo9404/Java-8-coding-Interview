package coding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {// HCL

	public static void main(String[] args) {
		String s = "Susanta Sahoo";
		s = s.toLowerCase();
		Map<String, Long> freq = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		String secondChar = freq.entrySet().stream().filter(e -> e.getValue() >= 2).map(e -> e.getKey()).skip(1)
				.findFirst().get();
		Map<String, Long> repeted = freq.entrySet().stream().filter(e -> e.getValue() >= 2).skip(1).limit(1)
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
		System.out.println(repeted);
		System.out.println(secondChar);
	}

}
