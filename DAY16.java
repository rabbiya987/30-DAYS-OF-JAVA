package java30;

public class DAY16 {
        public static void main(String[] args) {
            // Example usage
            double miles = 10;
            double kilometers = 16.0934;
    
            double convertedToKilometers = convertToKilometers(miles);
            double convertedToMiles = convertToMiles(kilometers);
    
            System.out.println(miles + " miles is " + convertedToKilometers + " kilometers.");
            System.out.println(kilometers + " kilometers is " + convertedToMiles + " miles.");
        }
    
        public static double convertToKilometers(double miles) {
            double k=miles*1.609344;
            return k;
        }
    
        public static double convertToMiles(double kilometers) {
             double m=kilometers*0.62137119;
            return m;
        }
    }
    

