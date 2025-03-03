package coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestProgram {// Mphasis

	public static void main(String[] args) {
		String name = "Susanta";
		name = name.toLowerCase();
		Map<String, Long> frequency = Arrays.stream(name.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		List<String> unique = frequency.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey())
				.collect(Collectors.toList());
		System.out.println(unique);

		List<EmployeeHCL> employeeList = new ArrayList<>();
		employeeList.add(new EmployeeHCL("Jeya", 22, 47000, "Chennai", List.of("9748294522", "9748294523")));
		employeeList.add(new EmployeeHCL("Gobinda", 37, 40000, "Kolkata", List.of("9748294524", "9748294525")));
		employeeList.add(new EmployeeHCL("Shubham", 24, 40000, "Pune", List.of("9748294526", "9748294527")));
		employeeList.add(new EmployeeHCL("Saptarshi", 36, 150000, "Kolkata", List.of("9748294555", "9748294529")));
		Double secondhighestSal = employeeList.stream().map(EmployeeHCL::getSalary).sorted(Comparator.reverseOrder())
				.skip(1).findFirst().get();
		System.out.println(secondhighestSal);
		EmployeeHCL secondHighestSalary = employeeList.stream().sorted(Comparator.comparing(EmployeeHCL::getSalary).reversed())
				.skip(1).findFirst().get();
		System.out.println(secondHighestSalary);
	}

}
