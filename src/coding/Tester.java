package coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Tester {

	public static void walk(int start, int... nums) {
		System.out.println(nums.length);

		}

	
	public static void main(String[] args) {
		 walk(12,13,134,6768);
		    Tester.walk(12);

		    int x = 20;
		    int y = 0;
		    try
		    {
		      int z = x/y;
		      throw new ArithmeticException();
//		      System.out.println("Result: " +z);
		    }
		    catch(ArithmeticException ae){
		      System.out.println("Exception caught: \n" +ae);
		     }
		    List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
	         
	        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);


	list1.stream().filter(list2::contains).forEach(System.out::println);
	int[] a = new int[] {4, 2, 5, 1};
    
    int[] b = new int[] {8, 1, 9, 5};

int[] c=IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
System.out.println(Arrays.toString(c));
	}

}
