package java30;

public class DAY6 {
        public static void main(String[] args) {
            // Test cases can be added here to validate the method's functionality.
    
            // Test case 1
            Object[] result1 = calculateBMI(170, 65); // height in cm, weight in kg
            System.out.println("BMI: " + result1[0] + ", Category: " + result1[1]);
    
            // Test case 2
            Object[] result2 = calculateBMI(180, 77); // height in cm, weight in kg
            System.out.println("BMI: " + result2[0] + ", Category: " + result2[1]);
    
            // Additional test cases
            Object[] result3 = calculateBMI(160, 90); // height in cm, weight in kg
            System.out.println("BMI: " + result3[0] + ", Category: " + result3[1]);
    
            Object[] result4 = calculateBMI(180, 50); // height in cm, weight in kg
            System.out.println("BMI: " + result4[0] + ", Category: " + result4[1]);
    
            Object[] result5 = calculateBMI(160, 45); // height in cm, weight in kg
            System.out.println("BMI: " + result5[0] + ", Category: " + result5[1]);
        }
    
        public static Object[] calculateBMI(double height, double weight) {
            // Check for invalid inputs
            if (height <= 0 || weight <= 0) {
                return new Object[] { 0.0, "Invalid input" };
            }
    
            // Convert height from centimeters to meters
            height = height / 100;
    
            // Calculate BMI
            double bmi = weight / (height * height);
    
            // Round BMI to two decimal places
            bmi = Math.round(bmi * 100.0) / 100.0;
    
            // Determine BMI category
            String category;
            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                category = "Healthy";
            } else if (bmi >= 25.0 && bmi <= 29.9) {
                category = "Overweight";
            } else {
                category = "Obesity";
            }
    
            // Return BMI value and category
            return new Object[] { bmi, category };
        }
    }
    
