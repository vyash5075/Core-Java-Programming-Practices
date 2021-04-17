    package strings;
    import java.util.*;

    /*
    input=>{2,4,6,8,10}
    31
    output=>2
    */
     class newbie {
       public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           String s=" 89";
           printkpc(s,"");
       }
     static  String   codes[]={".;","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
       public static void printkpc(String str,String ans){
           if(str.length()==0){
               System.out.println(ans);
               return;
           }
           char ch=str.charAt(0);
           String roq=str.substring(1);
           
           String codesforch=codes[ch-'0'];
           for(int i=0;i<codesforch.length();i++){
               printkpc(roq,ans+codesforch.charAt(i));
           }
       }
        
     }

