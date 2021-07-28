import java.util.*;
public class abc{
    public static void main(String args[]){
        int coins[]={2,3,5,7,9};
        boolean used[]=new boolean [coins.length];
        int amt=12;
        
        coinChange(coins,0,amt,"",used);
    }
    
    public static void coinChange(int coins[],int amtsf,int tamnt,String asf,boolean used[]){
        if(amtsf>tamnt){
            return;
        }
        else if(amtsf==tamnt){
            System.out.println(asf);
            return;
        }
        
        for(int i=0;i<coins.length;i++){
            if(used[i]==false){
                used[i]=true;
                coinChange(coins,amtsf+coins[i],tamnt,asf+coins[i]+"-",used);
                used[i]=false;
                
            }
            
        }
    }
}
