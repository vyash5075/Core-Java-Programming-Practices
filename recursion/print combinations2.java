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
        combination(new boolean[boxes],1,items,-1);
    }
    
    public static void combination(boolean boxes[],int ci,int ti,int llb){
        
        if(ci>ti){
            for(int i=0;i<boxes.length;i++){
                if(boxes[i]){
                    System.out.print("i");
                    
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
            return;
        }
        
        for(int b=llb+1;b<boxes.length;b++){
            if(boxes[b]==false){
                boxes[b]=true;
                combination(boxes,ci+1,ti,b);
                boxes[b]=false;
            }
        }
        
    }
        
}
