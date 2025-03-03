package test_project.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(12,13,23,26,43,32,65,72,51);
		Predicate<Integer> greaterthan=a->a>20;
		Predicate<Integer> lowerThanTwenty = (i) -> i < 50; 
		list.stream().filter(greaterthan.and(lowerThanTwenty)).forEach(System.out::println);
	}

}
