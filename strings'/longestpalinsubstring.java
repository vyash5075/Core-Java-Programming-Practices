import java.util.*;
public class longestpalinsubstring {
    static void longestPalSubstr(String str) { 
        int maxLength = 1; 
        int start = 0; 
        int len = str.length(); 
        int low, high; 
        
        for (int i = 1; i < len; ++i)  
        { 
            low = i - 1; 
            high = i; 
            while (low >= 0 && high < len 
                    && str.charAt(low) == str.charAt(high)) { 
                if (high - low + 1 > maxLength) { 
                    start = low; 
                    maxLength = high - low + 1; 
                } 
                --low; 
                ++high; 
            } 
            low = i - 1; 
            high = i + 1; 
            while (low >= 0 && high < len 
                    && str.charAt(low) == str.charAt(high)) { 
                if (high - low + 1 > maxLength) { 
                    start = low; 
                    maxLength = high - low + 1; 
                } 
                --low; 
                ++high; 
            } 
        } 
        System.out.print("Longest palindrome substring is: "); 
        print(str, start, start + maxLength ); 
    }    
 static void print(String str, int low, int high) { 
        System.out.println(str.substring(low, high )); 
    }
public static void main(String[] args) {        
        String str = "forgeeksskeegfor"; 
          longestPalSubstr(str); 
    } 
}
