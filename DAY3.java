package java30;

public class DAY3 {
    public static void main(String[] args) {
        // Test cases
        System.out.println("sumOfIntegers(10) = " + sumOfIntegers(10)); // Expected output: 55
        System.out.println("sumOfIntegers(0) = " + sumOfIntegers(0));   // Expected output: 0
        System.out.println("sumOfIntegers(7) = " + sumOfIntegers(7));   // Expected output: 28
        System.out.println("sumOfIntegers(18) = " + sumOfIntegers(18)); // Expected output: 171
    }

    // "sumOfIntegers" takes an integer and returns an integer
    public static int sumOfIntegers(int n) {
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
