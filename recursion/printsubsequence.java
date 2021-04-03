    package strings;
   // input abc
  // output abc ab ac a bc b c
 
    import java.util.*;
     class newbie {
        public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
         String str=sc.next();
         PrintSS(str,"");
        }
        public static void  PrintSS(String ques,String ans){
            
            if(ques.length()==0){
                System.out.print(ans+" ");
                return;
            }
            char ch=ques.charAt(0);
            String roq=ques.substring(1);
             PrintSS(roq,ans+ch);
            PrintSS(roq,ans+ "");
           
            
        }
      
        
    }
