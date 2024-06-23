package java30;
import java.util.Arrays;
import java.util.HashSet;
public class DAY12 {


    public static int[] commonElements(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        
        // Iterate over the first array
        for (int i = 0; i < array1.length; i++) {
            // Check if the current element exists in the second array
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    // If yes, add it to the set
                    set.add(array1[i]);
                    // Break the inner loop as we found the common element
                    break;
                }
            }
        }
        
        // Convert the set to an array and return
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 4, 5, 6};
        int[] result = commonElements(array1, array2);
        System.out.println("Common Elements: " + Arrays.toString(result)); // Output: Common Elements: [3, 4]
        
        // Example with no common elements
        int[] array3 = {1, 2, 3};
        int[] array4 = {4, 5, 6};
        result = commonElements(array3, array4);
        System.out.println("Common Elements: " + Arrays.toString(result)); // Output: Common Elements: []
        
        // Example with identical arrays
        int[] array5 = {1, 2, 3, 4};
        int[] array6 = {1, 2, 3, 4};
        result = commonElements(array5, array6);
        System.out.println("Common Elements: " + Arrays.toString(result)); // Output: Common Elements: [1, 2, 3, 4]
    }
}


