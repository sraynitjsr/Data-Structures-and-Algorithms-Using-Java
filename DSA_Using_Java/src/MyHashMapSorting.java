import java.util.*;
public class MyHashMapSorting {
    public static void start() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Amit", 40);
        hashMap.put("Virat", 20);
        hashMap.put("Rahul", 30);
        hashMap.put("Sourav", 50);
        hashMap.put("Laxman", 10);
        
        System.out.println("\nSorting HashMap by Key in Natural Order");
        hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        
        System.out.println("\nSorting HashMap by Key in Reversed Order");
        hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Collections.reverseOrder())).forEach(System.out::println);
        
        System.out.println("\nSorting HashMap by Value in Natural Order");
        hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        System.out.println("\nSorting HashMap by Value in Reversed Order");
        hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).forEach(System.out::println);
    }
}
