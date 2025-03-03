package coding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
/*using stream API
1. Group by location and print only the name?
2. print the list of all contacts.*/

public class EmployeeHCL {
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	private String name;
	private int age;
	private double salary;
	private String location;
	private List<String> contacts;

	public EmployeeHCL(String name, int age, double salary, String location, List<String> contacts) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.location = location;
		this.contacts = contacts;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public List<String> getContacts() {
		return contacts;
	}

	@Override
	public String toString() {
		return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + ", location='" + location + "'}";
	}

	public static void main(String[] args) {
		List<EmployeeHCL> employeeList = new ArrayList<>();
		employeeList.add(new EmployeeHCL("Jeya", 22, 47000, "Chennai", List.of("9748294522", "9748294523")));
		employeeList.add(new EmployeeHCL("Gobinda", 37, 40000, "Kolkata", List.of("9748294524", "9748294525")));
		employeeList.add(new EmployeeHCL("Shubham", 24, 40000, "Pune", List.of("9748294526", "9748294527")));
		employeeList.add(new EmployeeHCL("Saptarshi", 36, 150000, "Kolkata", List.of("9748294555", "9748294529")));

		// 1. Group by location and print only the names
		Map<String, List<String>> groupedByLocation = employeeList.stream().collect(Collectors
				.groupingBy(EmployeeHCL::getLocation, Collectors.mapping(EmployeeHCL::getName, Collectors.toList())));

		System.out.println("Employees grouped by location: " + groupedByLocation);

		// 2. Print the list of all contacts
		List<String> allContacts = employeeList.stream().flatMap(employee -> employee.getContacts().stream())
				.collect(Collectors.toList());

		System.out.println("List of all contacts: " + allContacts);
		// 3. Group by location and print only contacts
		System.out.println("\nGrouped by Location (Contacts):");
		Map<String, List<String>> contactsByLocation = employeeList.stream()
				.collect(Collectors.groupingBy(EmployeeHCL::getLocation,
						Collectors.flatMapping(employee -> employee.getContacts().stream(), Collectors.toList())));
		contactsByLocation.forEach((location, contacts) -> System.out.println(location + ": " + contacts));
		// 4. Get second highest salary in employee
		Double secondhighestSal = employeeList.stream().map(EmployeeHCL::getSalary).sorted(Comparator.reverseOrder())
				.skip(1).findFirst().get();
		System.out.println(secondhighestSal);

		// 5. Group by location and find the highest salary in each location
		Map<String, Double> highestSalaryByLocation = employeeList.stream()
				.collect(Collectors.groupingBy(emp -> emp.location,
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(emp -> emp.salary)),
								opt -> opt.map(emp -> emp.salary).orElse(0.0))));
		// Print the highest salary for each location
		highestSalaryByLocation.forEach(
				(location, salary) -> System.out.println("Location: " + location + " | Highest Salary: " + salary));

		// 6. Group by location and find minimum salary in each location
		Map<String, Optional<EmployeeHCL>> minSalaryByLocation = employeeList.stream().collect(Collectors.groupingBy(
				EmployeeHCL::getLocation, Collectors.minBy(Comparator.comparingDouble(EmployeeHCL::getSalary))));
		minSalaryByLocation.forEach(
				(location, salary) -> System.out.println("Location: " + location + " | Lowest Salary: " + salary));
		
		
		Map<String, Double> minSalaryByLocation2 = employeeList.stream()
				.collect(Collectors.groupingBy(EmployeeHCL::getLocation,
						Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(EmployeeHCL::getSalary)),
								opt -> opt.map(EmployeeHCL::getSalary).orElse(0.0))));
		minSalaryByLocation2.forEach(
				(location, salary) -> System.out.println("Location: " + location + " | Lowest Salary: " + salary));

	}
}
