package test_project.test;

import java.util.Scanner;

public class Calciulater2 {
	
public static void add(Integer n1, Integer n2) {
	int n3=n1+n2;
	System.out.println("Total SUM : "+n3);
	
}
public static void multi(Integer n1, Integer n2) {
	int n3=n1*n2;
	System.out.println("Total MULTIPLY : "+n3);
	
}
	
	public static void main(String[] args) {
		
		Integer number1;
		Integer number2;
		
		  Scanner input = new Scanner(System.in);
		  number1=input.nextInt();
		  number2=input.nextInt();
		  add(number1,number2);
		  multi(number1,number2);
	}

}
