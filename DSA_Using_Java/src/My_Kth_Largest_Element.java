import java.util.*;
public class My_Kth_Largest_Element {
    public static int getKthLargest(Integer[] arr, int K) {
		Arrays.sort(arr, Collections.reverseOrder());
		return arr[K - 1];
	}
    public static void start() {
        System.out.println("Find K-th Largest Element From an Array");
		Integer arr[] = new Integer[] { 1, 3, 5, 2, 4, 5, 6, 7, 9, 10, 8};
		System.out.println("2nd Largest Element is => " + getKthLargest(arr, 2));
        System.out.println("3th Largest Element is => " + getKthLargest(arr, 3));
        System.out.println("4th Largest Element is => " + getKthLargest(arr, 4));
    }
}
