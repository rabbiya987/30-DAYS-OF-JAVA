package java30;

public class DAY4 {
    public static void main(String[] args) {
        // Test cases
        System.out.println("Sum of digits (5): " + sumOfDigits(5));  // Expected Output: 5
        System.out.println("Sum of digits (34): " + sumOfDigits(34));  // Expected Output: 7
        System.out.println("Sum of digits (129): " + sumOfDigits(129)); // Expected Output: 3
        System.out.println("Sum of digits (54321): " + sumOfDigits(54321)); // Expected Output: 6
    }

    // the sumOfDigits methods should take an integer and return an integer
    public static int sumOfDigits(int x) {
        int sum=0,sumf=0;
        if(x>0 && x<10){
            return x;
        }
        else{
            while(x!=0){
                sum+=x%10;
                x/=10;
            }

            if(sum>0 && sum<10){
            return sum;
            }
            else{
            while(sum!=0){
                sumf+=sum%10;
                sum/=10;
            }}
            return sumf;
        }
    }
}
