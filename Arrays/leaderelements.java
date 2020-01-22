import java.util.*;
/**
 *
 * input: 7 4 5 7 3 
 * output: 7 7 3
 */
public class leaderelements {
    public static void leader(int arr[],int n)
    {
     int flag;
     for(int i=0;i<n-1;i++) {
         flag=1;
         int k=arr[i];
         for(int j=i+1;j<n;j++){
             if(k<arr[j]){
                 flag=0;
                 break;
             }
         }
             if(flag==1){
                 System.out.println(arr[i]);
             } 
     }
     System.out.println(arr[n-1]);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        leader(arr,n);
    }
}
