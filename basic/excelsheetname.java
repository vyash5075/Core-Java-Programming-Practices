    package strings;
    import java.util.*;
     class newbie {
         //input 28
         //output="AB"
         public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
            int n=28;
            
         }
        public String convertToTitle(int cn) {
        
        StringBuilder cc=new StringBuilder();
        while(cn>0){
            int rem=cn%26;
            if(rem==0){
                cc.append("Z");
                cn=(cn/26)-1;
                
            }
            else{
                cc.append((char)((rem - 1) + 'A'));
                cn=cn/26;
            }
            
        }
        
        return cc.reverse().toString();
        
    }
        
     }
