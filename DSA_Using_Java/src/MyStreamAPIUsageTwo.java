import java.util.*;
import java.util.stream.Collectors;

class Student {
    private int roll;
    private String name;
    public Student(int r, String n) {
        this.roll = r;
        this.name = n;
    }
    public int getRoll() {
        return this.roll;
    }
    public String getName() {
        return this.name;
    }
}

class MyStreamAPIUsageTwo {

    public static void sortByRoll(List<Student> students) {
        System.out.println("\n\nSorting by Roll in Ascending Order => " + students);
        students.stream().sorted(Comparator.comparing(Student::getRoll)).collect(Collectors.toList()).forEach(st -> System.out.print(st.getName() + "<=>" + st.getRoll() + "\t"));

        System.out.println("\n\nSorting by Roll in Descending Order => " + students);
        students.stream().sorted(Comparator.comparing(Student::getRoll).reversed()).collect(Collectors.toList()).forEach(st -> System.out.print(st.getName() + "<=>" + st.getRoll() + "\t"));
    }

    public static void sortByName(List<Student> students) {
        System.out.println("\n\nSorting by Name in Ascending Order => " + students);
        students.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList()).forEach(st -> System.out.print(st.getName() + "<=>" + st.getRoll() + "\t"));

        System.out.println("\n\nSorting by Name in Descending Order => " + students);
        students.stream().sorted(Comparator.comparing(Student::getName).reversed()).collect(Collectors.toList()).forEach(st -> System.out.print(st.getName() + "<=>" + st.getRoll() + "\t"));
    }

    public static void start() {
        System.out.println("\n\nInside Second Stream API Module");
        Student s1 = new Student(10,"Sachin");
        Student s3 = new Student(40,"Virat");
        Student s4 = new Student(20,"Dhoni");
        Student s2 = new Student(30,"Zaheer");
        List<Student> students = new ArrayList<>();
        students.add(s1); students.add(s2); students.add(s3); students.add(s4); 
        sortByName(students);
        sortByRoll(students);
        System.out.println("");
    }
}
