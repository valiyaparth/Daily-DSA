//Article Link:
//https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/

import java.util.*;
public class Duplicate_char{
    public static void duplicateChar(String str){
        Map<Character, Integer> freq = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(freq.containsKey(ch)){
                freq.put(ch, freq.get(ch)+1);
            }
            else{
                freq.put(ch, 1);
            }
        }
        for(Map.Entry<Character, Integer> map : freq.entrySet()){
            if(map.getValue() > 1){
                System.out.println("Char: " + map.getKey() + ", Frequency: " + map.getValue());
            }
        }
    }
    public static void main(String[] args) {
        String str = "helloworld";
        duplicateChar(str);
    }
}