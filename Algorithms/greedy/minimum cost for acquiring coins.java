/*

//https://www.geeksforgeeks.org/minimum-cost-for-acquiring-all-coins-with-k-extra-coins-allowed-with-every-coin/
Input : coin[] = {100, 20, 50, 10, 2, 5}, 
        k = 3
Output : 7

*/
import java.util.*;
public class gfg{
    public static void main(String args[]){
         int coin[] = { 8, 5, 3, 10,
                       2, 1, 15, 25 };
        int n = coin.length;
        int k = 3;
         
        System.out.print(minCost(coin, n, k));
    }
    
    public static int minCost(int arr[],int n,int k){
        Arrays.sort(arr);
        int coinsneeded=(int)Math.ceil(1.0*n/(k+1));
        int ans=0;
        for(int i=0;i<coinsneeded;i++){
            ans+=arr[i];
        }
        return ans;
    }
}
