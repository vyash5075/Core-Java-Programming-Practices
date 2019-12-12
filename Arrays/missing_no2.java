import java.util.*;
public class missing_no2 {
      public static void main(String args[])
    {
        int j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int xor1=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            xor1=xor1^arr[i];
        }
        int xor2=1;
        for(int i=2;i<=(arr.length+1);i++)
        {
            xor2=xor2^i;
        }
        System.out.println("missinig lelement is"+(xor1^xor2));
}
}