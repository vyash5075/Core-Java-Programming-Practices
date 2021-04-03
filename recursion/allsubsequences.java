    package strings;
   //[abc]=>[---,--c,-b-,-bc,a--,a-c,ab-,abc] 
    import java.util.*;
     class newbie {
        public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           String str=sc.next();
           ArrayList<String>al=gss(str);
           System.out.print(al);
        }
        
        //[bc]=>[--,-c,-b,bc]
        public static ArrayList<String>gss(String str){
                
            if(str.length()==0){
                ArrayList<String>bres=new ArrayList<>();
                bres.add("");
                return bres;
            }
        char ch=str.charAt(0);//a
        String ros=str.substring(1); //bc
        ArrayList<String>rres=  gss(ros);
        ArrayList<String>mres=new ArrayList<>();
        for(String rstr:rres){
            mres.add(""+rstr);
            mres.add(ch+rstr);
        
            
        }
        
        return mres;
        }
    }
