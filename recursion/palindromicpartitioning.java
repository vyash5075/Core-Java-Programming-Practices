    package strings;
    import java.util.*;
    
    /*
    input=> abaaba
    output=>
 (a) (b) (a) (a) (b) (a)
 (a) (b) (a) (aba)
 (a) (b) (aa) (b) (a)
 (a) (baab) (a)
 (aba) (a) (b) (a)
 (aba) (aba)
 (abaaba)
    */
     class newbie {
         
         public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
             String str="abaaba";
             
             palindromicpermutations(str,"");
         }
         public static void palindromicpermutations(String str,String asf){
             
             if(str.length()==0){
                 System.out.println(asf);
                 return;
             }
             for(int i=0;i<str.length();i++){
                 String prefix=str.substring(0,i+1);
                 String ros=str.substring(i+1);
                 if(ispalindrome(prefix)){
                     palindromicpermutations(ros,asf+" ("+prefix+")");
                 }
             }
         }
         public static boolean ispalindrome(String s){
             int li=0;
             int ri=s.length()-1;
             while(li<ri){
                 char left =s.charAt(li);
                 char right=s.charAt(ri);
                 if(left!=right){
                     return false;
                 }
                 li++;
                 ri--;
             }
             return true;
         }
     }
         
     
