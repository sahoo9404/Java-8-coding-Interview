package coding;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TestLTI {

	public static void main(String[] args) {
		String s = "This is a test test";
		String unique = Arrays.stream(s.split(" ")).distinct().collect(Collectors.joining(" "));
		System.out.println(unique);
	}

}
