    package strings;
   //[abc]=>[---,--c,-b-,-bc,a--,a-c,ab-,abc] 
    import java.util.*;
     class newbie {
        public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           String str=sc.next();
           ArrayList<String>words=getkpc(str);
           System.out.print(words);
        }
        //make global array
        static String codes[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
                
        //678
        public static ArrayList<String>getkpc(String str){
                
            if(str.length()==0){
                ArrayList<String>bres=new ArrayList<>();
                bres.add("");
                return bres;
            }
        int ch=Character.getNumericValue(str.charAt(0));//6
        System.out.print(ch);
        String ros=str.substring(1); //78
        ArrayList<String>rres=  getkpc(ros);
        ArrayList<String>mres=new ArrayList<>();
        
        String codesforch=codes[ch];
        for(int i=0;i<codesforch.length();i++){
            char chcode=codesforch.charAt(i);
            for(String  rstr:rres){
                mres.add(chcode+rstr);
            }
        }
       
        
        return mres;
        }
    }
