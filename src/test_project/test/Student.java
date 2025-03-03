package test_project.test;

import java.util.HashMap;
import java.util.Objects;
public class Student {

	String name;
	int id;
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public int hashCode() {
//		return Objects.hash(id, name);
		return name.hashCode()+id;
	}
public boolean equals(Object o) {
	if(this==o)
		return true;
	if(o instanceof Student) {
		Student s2=(Student) o;
		if(name.equals(s2.name) && id==s2.id)
			return true;
		else return false;
	}
	return false;
}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	public static void main(String[] args) {
		Student s=new Student("Hari", 1);
		Student s1=new Student("Ram", 2);
		Student s2=new Student("Ram", 2);
		Student s3=s;
		System.out.println(s1.hashCode()+"    "+s2.hashCode());
		HashMap h1=new HashMap();
		h1.put(s, 1);
		h1.put(s1, 2);
		h1.put(s2, 6);
		h1.put(s3, 4);
		System.out.println(h1);
		System.out.println(s1.equals(s2));

	}

}
