package coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMphas {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(4, 9, 0, 0, 8, 7, 0, 6, 0, 12, 0, 19, 0, 0);
		List<String> sort = number.stream().map(n -> n % 2 == 0 ? n + "E" : n + "O").collect(Collectors.toList());
		/*
		 * List<String> oddEven = number.stream().map(n -> { if(n % 2 == 0) n=n + "E" ;
		 * else n= n + "O"; return n; } ).
		 collect(Collectors.toList());
		*/
		System.out.println(sort);
	}

}
