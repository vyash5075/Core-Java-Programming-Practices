/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class ques17 {
    public static void removeduplicacy(String str)
    {
        char arr[]= str.toCharArray();
        int arr2[]=new int[1000];
        for(int i=0;i<arr.length;i++)
        {
            arr2[arr[i]]=arr2[arr[i]]+1;
        }
        System.out.println("unique elements are");
        for(int i=0;i<arr.length;i++)
        {
            if(arr2[arr[i]]>=1)
            {
                System.out.println(arr[i]);
                arr2[arr[i]]=0;
            }
        }
    }
            public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter String");
        String str=sc.next();
        removeduplicacy(str);
    }
}
---------------------------------------------------------------------
//way2


ublic class test {

    public static void main(String[] args) {

        String input = new String("abbc");
        String output = new String();

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < output.length(); j++) {
                if (input.charAt(i) != output.charAt(j)) {
                    output = output + input.charAt(i);
                }
            }
        }

        System.out.println(output);

    }

}
-----------------------------------------------------------------------
//way3


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class ques23 {
    public static void removeduplicate(String str)
    {
        char arr[]=str.toCharArray();
        int index=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int j;
           for( j=0;j<=i;j++)
           {
               if(arr[i]==arr[j])
               {
                   break;
               }
           }
           if(i==j)
           {
            arr[index]=arr[j];
            index++;
           }
        }
           Arrays.copyOf(arr,index);
           for(int i=0;i<index;i++)
           {
              System.out.print(arr[i]+",");
           }
            
        }
      
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        removeduplicate(str);
    }
}
