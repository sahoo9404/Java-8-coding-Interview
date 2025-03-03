package coding;

import java.util.ArrayList;
import java.util.List;

public class Student {
	String name;
	int rank;
	int Age;
	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	List<String> subject;

	public Student(String name, int rank, ArrayList<String> subject) {
		super();
		this.name = name;
		this.rank = rank;
		this.subject = subject;
	}

	public List<String> getSubject() {
		return subject;
	}

	public void setSubject(ArrayList<String> subject) {
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rank=" + rank + ", subject=" + subject + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Student(String name, List<String> list) {
		super();
		this.name = name;
		this.subject = list;
	}

	public Student(String name, int rank) {
		super();
		this.name = name;
		this.rank = rank;
	}
}
