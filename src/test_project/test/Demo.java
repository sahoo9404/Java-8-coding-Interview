package test_project.test;
@FunctionalInterface
public interface Demo {
public void demo();
public default void test2() {
	System.out.println("Demo Default Method");
}
}
