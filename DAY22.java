package java30;

public class DAY22 {
        public static void main(String[] args) {
            // Test cases
            int[] array1 = {1, 2, 3, 4};
            int[] array2 = {15, 20, 25};
            int[] array3 = {12, 18};
            int[] emptyArray = {};
            int[] singleElementArray = {5};
    
            System.out.println("LCM of [1, 2, 3, 4]: " + calculateLCM(array1));
            System.out.println("LCM of [15, 20, 25]: " + calculateLCM(array2));
            System.out.println("LCM of [12, 18]: " + calculateLCM(array3));
            System.out.println("LCM of []: " + calculateLCM(emptyArray));
            System.out.println("LCM of [5]: " + calculateLCM(singleElementArray));
        }
        public static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
        public static int lcm(int a, int b){
            return (a*b)/gcd(a,b);
        }
        public static int calculateLCM(int[] array) {
            // Write your code here
            
            if (array.length==0){
                return 1;
            }
            int result=Math.abs(array[0]);
            for(int i=0;i<array.length;i++){
                result=lcm(result,array[i]);
            }
            return result;
        }}
