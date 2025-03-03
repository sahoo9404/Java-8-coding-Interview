package test_project.test;
@FunctionalInterface
public interface Demo2 {
public void test();

public default void test2() {
	System.out.println("Demo2 Default Method");
}
}
