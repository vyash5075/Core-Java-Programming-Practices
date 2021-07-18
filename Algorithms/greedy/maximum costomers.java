//https://www.geeksforgeeks.org/maximum-number-customers-can-satisfied-given-quantity/
/*
Input : n = 5, d = 5
        a = 1, b = 1
        2 0
        3 2
        4 4
        10 0
        0 1
Output : 2
         5 1 

*/
import java.util.*;
public class gfg{
    public static void main(String args[]){
        int n=5;
        int d=5;
        int a=1;
        int b=1;
        int arr[][] = {{2, 0},
					{3, 2},
					{4, 4},
					{10, 0},
					{0, 1}};
	
	System.out.println(countcustomers(arr,n,d,a,b));
    }
    
    public static int countcustomers(int arr[][],int n,int d,int a,int b){
        int ar[]=new int [n];
        
        for(int i=0;i<n;i++){
            ar[i]=arr[i][0]*a+arr[i][1]*b;
            
        }
        Arrays.sort(ar);
        int count=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]<d){
               // System.out.println(i+1);
                d=d-ar[i];
                count++;
            }
        }
        return count;
        
    }
}
