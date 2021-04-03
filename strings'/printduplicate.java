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
public class ques16 {
    public static void duplicacy(String s)
    {
        char arr[]= s.toCharArray();
        int arr2[]=new int[1000];
        for(int i=0;i<arr.length;i++)
        {
            arr2[arr[i]]=arr2[arr[i]]+1;
        }
         System.out.println("duplicate no. are");
        for(int i=0;i<arr.length;i++)
        {
            if(arr2[arr[i]]>1)
            {
                System.out.println(arr[i]);
                arr2[arr[i]]=0;
                arr2[arr[i]]=0;
            }
        }
    }
public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String s=sc.nextLine();
       duplicacy(s);
    }
}
-------------------------------------------------------------------
//way2 by hashmap




package strings;
import java.util.*;

public class ques25 {
    public static void finduplicate(String str)
    {
        char arr[]=str.toCharArray();
        Map<Character,Integer>hm=new HashMap<>();
        for(char c:arr)
        {
            if(!hm.containsKey(c))
            {
                hm.put(c,1);
            }
            else{
                hm.put(c,hm.get(c)+1);
            }
        }
        System.out.println("duplicate elements are");
        Set<Map.Entry<Character,Integer>>es=hm.entrySet();
         for(Map.Entry<Character,Integer>p:es)
        {
            if(p.getValue()>1)
            {
                System.out.println(p.getKey());
            }
        }
         System.out.println("anothe way of printing");
          for(Character x: hm.keySet())
    {
        if(hm.get(x)>1)
        {
            System.out.println(x);
        }
    }
    }
    
    
    
   
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.next();
         finduplicate(str);
    }
}




