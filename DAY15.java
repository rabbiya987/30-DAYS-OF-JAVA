package java30;
import java.util.HashMap;
import java.util.Map;

public class DAY15 {
        public static void main(String[] args) {
            // Example test cases
            System.out.println(calculateVowels("hello world")); // {e: 1, o: 2}
            System.out.println(calculateVowels("rhythm")); // {a: 0, e: 0, i: 0, o: 0, u: 0}
        }
    
        public static Map<Character, Integer> calculateVowels(String input) {
            Map<Character,Integer> vowelcount=new HashMap<Character,Integer>();

            char[] vowel={'a','e','i','o','u'};
            input=input.toLowerCase();

            for(char c:input.toCharArray()){
                for(char vowels:vowel){
                    if(c==vowels){
                        vowelcount.put(vowels,vowelcount.getOrDefault(vowels,0)+1);
                    }
                }
            }
            return vowelcount;
        
        }
    }
    
