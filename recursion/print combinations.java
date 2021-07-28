/*
boxes=4;
items=2;
 output: 
ii--
i-i-
i--i
-ii-
-i-i
--ii
*/



import java.util.*;
public class abc{
    public static void main(String args[]){
        int boxes=4;
        int items=2;
        
        combination(1,boxes,0,items,"");
    }
    
    public static void combination(int cb,int tb,int ssf,int ts,String asf){
        
        if(cb>tb){
            
            if(ssf==ts)
         System.out.println(asf);
         
         return;
        }
         combination(cb+1,tb,ssf+1,ts,asf+"i");
        combination(cb+1,tb,ssf,ts,asf+"-");
         
        
    }
        
}
