package test_project.test;

public class Test {

	public static void main(String[] args) {
		String name = "Rajashree";
		System.out.println(name.substring(0,3).toUpperCase());
		System.out.println(name.toUpperCase());
		name=name.toUpperCase();
		System.out.println(name);
		
		
		
		int x=10;//x=11
		int y=++x;  //x=x+1  y=11
		int z=x++;
		System.out.println("X::"+x);
		System.out.println("Y::"+y);
		System.out.println("Z::"+z);
		
		
		
		
		System.out.println(name.length());
		try {
			System.out.println("1");
			int n = 9 / 0;
			System.out.println("After Exception");
			
		} catch (NullPointerException e) {
			System.out.println("2");
		}  catch (ArithmeticException e) {
			System.out.println("6");
		}
		catch (Exception e) {
			System.out.println("3");
		} finally {
			System.out.println("4");
		}
		System.out.println("END");
	}

}
