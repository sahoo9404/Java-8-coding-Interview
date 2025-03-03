package test_project.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class VariableTest {

	int num=10;//60
	static int number=30;
	
	{
		System.out.println("Instance block Executed :"+ num);
	}
	
	public void methodName() {
		System.out.println("Method calling");
		System.out.println("STATIC VARIABLE : "+number);
		number=50;
		num=60;
	}
	public static void main(String[] args) {
		
		VariableTest test=new VariableTest();
		test.methodName();
		VariableTest test1=new VariableTest();
		test1.number=20;
		test1.num=40;
		System.out.println(test1.number);
		System.out.println(number);
		
		System.out.println(test1.num);
		System.out.println(test.num);
		
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        
        listOfStrings.stream().sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).forEach(System.out::println);
   
	}

}
