import java.util.*;
public class cut_the_sticks {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sticksleft=n;
        int curr=arr[0];
        int count=0;
        System.out.println(n);
        for(int i=0;i<n;i++)
        {
            if(curr==arr[i])
            {
                count++;
            }
            else{
                sticksleft-=count;
                count=1;
                curr=arr[i];
                System.out.println("sticksleft"+sticksleft);
            }
        }
    } 
}
