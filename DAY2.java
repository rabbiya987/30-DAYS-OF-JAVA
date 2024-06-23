package java30;

public class DAY2 {
    public static void main(String[] args) {
        // Example usage of the reverseString method
        String example1 = reverseString("codedamn");
        String example2 = reverseString("123");

        // Output the results
        System.out.println(example1); // Expected output: nmadedoc
        System.out.println(example2); // Expected output: 321
    }


    // the method should accept a string and return a string
    public static String reverseString(String x) {
        char[] arr=x.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left < right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;

        }
        return new String(arr);
    }
}
