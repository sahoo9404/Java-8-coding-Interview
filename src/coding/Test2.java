package coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Happiest mind
public class Test2 {

	public static void main(String[] args) {
		List<String> employee = Arrays.asList("Hari", "Suraj", "Ram", "Surya", "Ram chandra");
		// Grouping 1st charecter 
		Map<Character, List<String>> group = employee.stream().collect(Collectors.groupingBy(e -> e.charAt(0)));
		group.forEach((k, v) -> System.out.println(k + "   " + v));

		List<Student> listStudent = Arrays.asList(new Student("har", 10), new Student("Ram", 20),
				new Student("Susanta", 40), new Student("Harish", 3));
		Student st = listStudent.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();
		System.out.println(st);
		List<Student> listStudent1 = Arrays.asList(new Student("Alice", Arrays.asList("Math", "Science", "English")),
				new Student("Bob", Arrays.asList("History", "Math")),
				new Student("Charlie", Arrays.asList("Physics", "Chemistry", "Math", "Biology")));

		Map<String, Long> groupbyName = listStudent1.stream()
				.collect(Collectors.toMap(Student::getName, student -> (long) student.getSubject().size()));

		System.out.println(groupbyName);
		List<Integer> emp = listStudent.stream().map(e -> e.getRank() * 110 / 100).collect(Collectors.toList());
		System.out.println(emp);
	}

}
