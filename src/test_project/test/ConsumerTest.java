package test_project.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Using BiConsumer with forEach
        BiConsumer<String, Integer> action = (key, value) -> {
        	key=key+" Sahoo";
        	value=value*110/100;
        	  System.out.println("Key: " + key + ", Value: " + value);
        };
              

        map.forEach(action);
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using an explicit Consumer implementation
        Consumer<String> printName = name ->{
        	name=name+" Sahoo";
        	System.out.println(name);
        };

        names.forEach(printName);
	 
	}

}
