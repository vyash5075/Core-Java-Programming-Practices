/*
https://www.geeksforgeeks.org/buy-maximum-stocks-stocks-can-bought-th-day/
Input : price[] = { 10, 7, 19 }, 
              k = 45.
Output : 4
A customer purchases 1 stock on day 1, 
2 stocks on day 2 and 1 stock on day 3 for 
10, 7 * 2 = 14 and 19 respectively. Hence, 
total amount is 10 + 14 + 19 = 43 and number 
of stocks purchased is 4.

*/
import java.util.*;
public class abc{
    public static void main(String args[]){
        int price[]={10,7,19};
        int budget=45;
        int n=price.length;
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=price[i];
            arr[i][1]=i+1;
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i][0]);
        //     System.out.println(arr[i][1]);
        // }
         System.out.println(countstocks(arr,budget));
    }
    public static int countstocks(int arr[][],int budget){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=Math.min(arr[i][1],budget/arr[i][0]);
            budget-=arr[i][0]*Math.min(arr[i][1],budget/arr[i][0]);
        }
        return ans;
    }
}
