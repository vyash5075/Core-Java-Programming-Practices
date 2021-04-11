    package strings;
    import java.util.*;
     class newbie {
         //input "AB"
         //output=28
         public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
         String s="AB";
          System.out.println(titleToNumber(s));
            
         }
        public static int titleToNumber(String s) {
        int result = 0;
    for (int i = 0; i < s.length(); i++)
    {
        result *= 26;
        System.out.println(result);
        result += s.charAt(i) - 'A' + 1;
    }
    return result;
        
    }
     }
