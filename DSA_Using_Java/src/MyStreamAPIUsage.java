import java.util.*;
import java.util.stream.Collectors;

class MyStreamAPIUsage {
    
    public static void printEvenNumbers() {
        List<Integer> list = new ArrayList<>();
        list.add(10); list.add(15); list.add(20); list.add(25); list.add(30);

        System.out.println("\nPrinting Even Numbers From The List => " + list);
        list.stream().filter(i -> i%2 == 0).collect(Collectors.toList()).forEach(evenNum -> System.out.print(evenNum + " "));
    }

    public static void filterExampleOne() {
        List<String> list = new ArrayList<>();
        list.add("Amit"); list.add("Ajay"); list.add("Sunil"); list.add("Kamal"); list.add("Ajit");

        System.out.println("\n\nPrinting Names Which Starts With A => " + list);
        list.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList()).forEach(name -> System.out.print(name + " "));

        System.out.println("\n\nPrinting Names Which Does Not Start With A => " + list);
        list.stream().filter(name -> !name.startsWith("A")).collect(Collectors.toList()).forEach(name -> System.out.print(name + " "));
    }

    public static void mapExampleOne() {
        List<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);

        System.out.println("\n\nPrinting Square of The List Elements => " + list);
        list.stream().map(data -> data * data).collect(Collectors.toList()).forEach(data -> System.out.print(data + " "));
    }
    
    public static void exampleFilterAndMapData() {
        List<Integer> list = new ArrayList<>();
        list.add(1); list.add(5); list.add(6); list.add(9); list.add(8);
        
        System.out.println("\n\nFilter Data and Square Them, Filter Only Odd Numbers Here => " + list);
        list.stream().filter(data -> data%2 != 0).map(data -> data * data).collect(Collectors.toList()).forEach(data -> System.out.print(data + " "));
    }

    public static void start() {
        System.out.println("\nInside Stream API Module");
        
        printEvenNumbers();
        
        filterExampleOne();

        mapExampleOne();

        exampleFilterAndMapData();

        System.out.println("");
    }
}
