package Java8.OptionalClass;

import java.util.Optional;

public class OptionalExample1 {
	public static void main(String[] args) {  
        String[] str = new String[10];  
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";
        str[1] = "JAVA";
        Optional<String> checkNull = Optional.ofNullable(str[5]); 
//        Optional<String> value = Optional.of(str[5]);
//        System.out.println("Filtered value: "+value.filter((s)->s.equals("JAVA")));  
        checkNull.ifPresent(System.out::println);  
        System.out.println("Print "+ checkNull);
        if(checkNull.isPresent()){  // check for value is present or not  
            String lowercaseString = str[5].toLowerCase();  
            System.out.println(lowercaseString);  
        }else  
            System.out.println("string value is not present");  
        Optional<String> empty = Optional.empty();  
        System.out.println("   "+empty);  
    }
}
