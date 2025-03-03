package coding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestCogni {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student("Hari", 20));
		list.add(new Student("Ram", 20));
		list.add(new Student("Susanta", 34));
		list.add(new Student("Ramesh", 40));
		List<Student> sort = list.stream().sorted(Comparator.comparing(Student::getAge).thenComparing(Student::getName))
				.collect(Collectors.toList());
		System.out.println(sort);
	}

}
