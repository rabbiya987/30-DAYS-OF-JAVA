package java30;

public class DAY7 {
        public static void main(String[] args) {
            // Example test cases
            System.out.println(isLeapYear(2000)); // true
            System.out.println(isLeapYear(1989)); // false
            System.out.println(isLeapYear(1900)); // false
            System.out.println(isLeapYear(2012)); // true
            System.out.println(isLeapYear(2019)); // false
        }
    
        public static boolean isLeapYear(int year) {
            // Check if the year is divisible by 4
            if (year % 4 == 0) {
                // If the year is also divisible by 100
                if (year % 100 == 0) {
                    // The year must also be divisible by 400 to be a leap year
                    if (year % 400 == 0) {
                        return true;
                    } 
                    else {
                        return false;
                    }
                } 
                else {
                    return true;
                }
            } 
            else {
                return false;
            }
        }
    }
    

