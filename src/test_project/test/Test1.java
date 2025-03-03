package test_project.test;

public class Test1 {
	static int i = 4;
	static int j = 4;
	
	
    static
    {
        i = i-- - --i;
    }
    static
    {
        j = --j - j--;
    }
	public static void main(String[] args) {
System.out.println(i);
System.out.println(j);
System.out.println(j--);
	}

}
