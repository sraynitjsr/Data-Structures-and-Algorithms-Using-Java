package github.com.sraynitjsr;

import java.util.*;

class Student {
	private int roll;
	private String name;
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
}

class SortStudents implements Comparator<Student> {
	public int compare(Student s1, Student s2) {		
		return s1.getName().length() > s2.getName().length()?-1:1;
	}
}

public class MyClassSorting {
	public static void sortStudentsByNameLength() {
		Student s1 = new Student(30, "Small");
		Student s2 = new Student(20, "Little Big");
		Student s3 = new Student(10, "Little Bigger");
		Student s4 = new Student(50, "A Lot Bigger Now");
		Student s5 = new Student(40, "The Largest Possible");

		ArrayList<Student> students = new ArrayList<>();

		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);

		System.out.println("\nBefore Sorting");
		students.forEach(st -> 
		System.out.println(st.getName() + " " + st.getRoll())
				);

		Collections.sort(students, new SortStudents());

		System.out.println("\nAfter Sorting");
		students.forEach(st -> 
			System.out.println(st.getName() + " " + st.getRoll())
		);
	}
}
