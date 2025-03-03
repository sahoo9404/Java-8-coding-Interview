package coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

//Given a student list, find ids of the Students with Same marks

public class StudentHCL {

	int id;
	double marks;
	int age;

	public StudentHCL(int id, double marks, int age) {
		this.id = id;
		this.marks = marks;
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentHCL [id=" + id + ", marks=" + marks + ", age=" + age + "]";
	}

	public int getId() {
		return id;
	}

	public double getMarks() {
		return marks;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		List<StudentHCL> students = Arrays.asList(new StudentHCL(1, 85.0, 20), new StudentHCL(2, 90.0, 32),
				new StudentHCL(3, 85.0, 16), new StudentHCL(4, 75.0, 72), new StudentHCL(5, 90.0, 62));

		// Group students by their marks
		Map<Double, List<Integer>> marksToIdsMap = students.stream().collect(Collectors.groupingBy(StudentHCL::getMarks, // Group
																															// by
																															// marks
				Collectors.mapping(StudentHCL::getId, Collectors.toList()) // Collect IDs
		));

		// Find marks with more than one student
		marksToIdsMap.entrySet().stream().filter(entry -> entry.getValue().size() > 1) // Only include marks with
																						// duplicate students
				.forEach(entry -> {
					System.out.println("Marks: " + entry.getKey() + " -> Student IDs: " + entry.getValue());
				});
		List<StudentHCL> updateStudents =students.stream().map(s->{
			s.setMarks(s.getMarks()*1.10);
		return s;
		}).collect(Collectors.toList());
		 Consumer<StudentHCL> display = a -> System.out.println(a);// Used consumer Interface
		updateStudents.forEach(display);
	}

	
}
