package github.com.sraynitjsr;

import java.util.*;

public class MyArrayList {
	
	public static void displayList(ArrayList<Integer> newArrayList) {
		System.out.print("\nCurrent List is => ");
		
		newArrayList.forEach(val->System.out.print(val + " "));
		
		System.out.println();
	}
	
	public static void operateList() {
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(10);
		arrayList.add(25);
		arrayList.add(50);
		arrayList.add(75);
		arrayList.add(100);
		
		displayList(arrayList);
		
		System.out.println("\nDeleting Element 25");
		arrayList.remove((Object)25);
		
		displayList(arrayList);
		
		System.out.println("\nDeleting Value at Index 3");
		arrayList.remove(3);
		
		displayList(arrayList);
	}
}
