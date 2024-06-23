package java30;

public class DAY24 {
        public static void main(String[] args) {
            // Testing the method with different inputs
            System.out.println(isPythagoreanTriplet(new int[]{5, 4, 3})); // Expected Output: True
            System.out.println(isPythagoreanTriplet(new int[]{5, 12, 13})); // Expected Output: True
            System.out.println(isPythagoreanTriplet(new int[]{2, 3, 4})); // Expected Output: False
            System.out.println(isPythagoreanTriplet(new int[]{7, 25, 24})); // Expected Output: True
            System.out.println(isPythagoreanTriplet(new int[]{1, 5, 8})); // Expected Output: False
        }
    
        public static boolean isPythagoreanTriplet(int[] numbers) {
            // write your code here 
            // sort the array
            java.util.Arrays.sort(numbers);

            // assigning variables
            int a=numbers[0];
            int b=numbers[1];
            int c=numbers[2];

            if(a*a+(b*b)==c*c){
                return true;
            }
            else{
                return false;
            }
        }
    }
