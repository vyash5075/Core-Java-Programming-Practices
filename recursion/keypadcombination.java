    package strings;
   // input 79
   //output ty tz uy uz
  
    import java.util.*;
     class newbie {
        public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
         String str=sc.next();
         Printkpc(str,"");
        }
        
        
        static String codes[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
        public static void  Printkpc(String ques,String ans){
            
            if(ques.length()==0){
                System.out.print(ans+" ");
                return;
            }
              int ch=Character.getNumericValue(ques.charAt(0));
            String roq=ques.substring(1);
            String codesforch=codes[ch];
           for(int i=0;i<codesforch.length();i++){
            char chcode=codesforch.charAt(i);
            Printkpc(roq,ans+chcode);
        }
           
            
        }
      
        
    }
