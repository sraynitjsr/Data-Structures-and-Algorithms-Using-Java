import java.util.*;

public class MyTripletSum {
    public static void start() {
        int myArray[] = {1, 4, 45, 6, 10, 8};
        int target = 22;
        Arrays.sort(myArray);
        for(int i = 0; i < myArray.length; i++) {
            int left = i + 1;
            int right = myArray.length - 1;
            while(left < right) {
                if((myArray[i] + myArray[left] + myArray[right]) == target) {
                    System.out.println("Triplet => " + myArray[i] + " " + myArray[left] + " " + myArray[right]);
                    return;
                } else if ((myArray[i] + myArray[left] + myArray[right]) < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }
}
