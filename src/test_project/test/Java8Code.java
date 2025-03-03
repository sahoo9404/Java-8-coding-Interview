package test_project.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java8Code {

    public static void main(String[] args) 
    {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML","C+", "Kotlin", "C++", "COBOL", "C");
         
        listOfStrings.stream().sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).forEach(System.out::println);
    }
}
