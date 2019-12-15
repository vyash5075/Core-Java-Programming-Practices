import java.util.*;
public class anagram {
  public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string 1");
        String str1=sc.next();
        System.out.println("enter String 2");
         String str2=sc.next();
         int l1=str1.length();
         int l2=str2.length();
         char arr1[]=new char[l1];
         char arr2[]=new char[l2];
         int j=0;
         for(int i=0;i<l1;i++)
         {
             arr1[j]=str1.charAt(i);
             j++;
         }
         int k=0;
         for(int i=0;i<l2;i++)
         {
             arr2[k]=str2.charAt(i);
             k++;
         }
         Arrays.sort(arr1);
         Arrays.sort(arr2);
         if(Arrays.equals(arr1, arr2))
         System.out.println("true");
         else
          System.out.println("false");        
}
}
