package java30;
import java.util.HashMap;
import java.util.Map;

public class DAY27 {
 
        public static void main(String[] args) {
            // Test cases
            System.out.println(calculateIPCount("74.125.227.0", 26)); // Expected Output: {lastIP=74.125.227.63, count=64}
            System.out.println(calculateIPCount("74.125.227.0", 29)); // Expected Output: {lastIP=74.125.227.7, count=8}
            System.out.println(calculateIPCount("74.125.227.0", 13)); // Expected Output: {lastIP=74.127.255.255, count=524288}
        }
    
        public static Map<String, Object> calculateIPCount(String ipAddress, int cidr) {
            // write your code here
            Map<String, Object> result = new HashMap<>();
        
            // Calculate the number of available IP addresses
            long numAddresses = (long) Math.pow(2, 32 - cidr);
            
            // Convert IP address to a 32-bit integer
            long ipAsLong = ipToLong(ipAddress);
            
            // Calculate the last IP address in the CIDR block
            long lastIpAsLong = ipAsLong + numAddresses - 1;
            
            // Convert the last IP address back to String format
            String lastIp = longToIp(lastIpAsLong);
            
            // Prepare the result map
            result.put("count", numAddresses);
            result.put("lastIP", lastIp);
            
            return result;
        }
    
        // Helper method to convert IP address string to a 32-bit integer
        private static long ipToLong(String ip) {
            String[] octets = ip.split("\\.");
            long result = 0;
            for (int i = 0; i < 4; i++) {
                result |= Long.parseLong(octets[i]) << (24 - (8 * i));
            }
            return result;
        }
    
        // Helper method to convert a 32-bit integer to an IP address string
        private static String longToIp(long ip) {
            return String.format("%d.%d.%d.%d",
                    (ip >> 24) & 0xFF,
                    (ip >> 16) & 0xFF,
                    (ip >> 8) & 0xFF,
                    ip & 0xFF);
        }
    } 
    

