package test_project.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Testprogram {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hari");
		sb.append("Krushna");
		System.out.println(sb);

		String str = "JAVA OPEN SOURCE JAVA open";
		str = str.toLowerCase();
		Set<String> unique = new HashSet<>();
		Set<String> frequncy = Arrays.stream(str.split(" ")).filter(s -> !unique.add(s)).collect(Collectors.toSet());
		System.out.println(frequncy);
		List<String> listOfStrings = Arrays.asList("Java","Cava", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

		listOfStrings.stream().sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).forEach(System.out::println);

		 List<String> listOfString = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
         
	        Map<String, Long> elementCountMap = listOfString.stream()
	                                                         .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
	         
	        Entry<String, Long> mostFrequentElement = elementCountMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
	        Map<String, Long> sortedMap = elementCountMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
	        
	        System.out.println("Most Frequent Element : "+mostFrequentElement);
	         
	        System.out.println("Count : "+sortedMap);
	        
	        int[] intArray = new int[]{ 123,24,13,43,5,16,78,18,9,10 }; 
	        List<String> list = Arrays.stream(intArray).boxed()
                    .map(s -> s + "")
                    .filter(s -> s.startsWith("1"))
                    .collect(Collectors.toList());

System.out.println(list);
		

Map<Integer, String> idNameMap = Map.of(
	    1, "Charlie",
	    2, "Alice",
	    3, "Bob",
	    4, "Alice"
	);
Map<Integer,String> sortedbyValue= idNameMap.entrySet().stream().sorted(Entry.comparingByValue(Comparator.comparing(String::length))).collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));
sortedbyValue.forEach((k,v)->System.out.println(k+"    "+v));
	
	
	
	
	
	}

}
