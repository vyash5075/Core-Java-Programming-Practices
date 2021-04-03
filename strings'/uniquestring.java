import java.util.*;
public class uniquestring {
    public static void  unique(String s)
    {
        String n=new String();
        int count=0;
        if(s.length()<=1)
        {
            System.out.println(s);   
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                while(i<s.length()-1&&s.charAt(i)==s.charAt(i+1))
                {
                    if(i<s.length()-2&&s.charAt(i)!=s.charAt(i+2))
                    {
                        i=i+2;    
                    }
                    else{
                        i++;
                        count++;
                    }
                }
                    if(i!=s.length()-1)
                    {
                        n=n+s.charAt(i);
                    }
                    else{
                        if(i==s.length()-1&&s.charAt(i)!=s.charAt(i-1))
                            n=n+s.charAt(i);
                    }      
                }
                if(count>0)
                    unique(n);
                else
                    System.out.println(n);
            }
        }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String s=sc.next();
        unique(s);          
    }
}


----------------------------------------------------------------------------------------
//way2 by hashmap


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
public class ques26 {
    public static void characters(String s)
    {
        char arr[]=s.toCharArray();
        Map<Character,Integer>hm=new HashMap<>();
        for(char ch:arr)
        {
            if(!hm.containsKey(ch))
            {
                hm.put(ch,1);
            }
            else{
                hm.put(ch,hm.get(ch)+1);
            }
        }
        System.out.println("characters present in the given string are");
        Set<Map.Entry<Character,Integer>>es=hm.entrySet();
        for(Map.Entry<Character,Integer>p:es)
        {
            if(p.getValue()>=1)
            {
                System.out.println(p.getKey());
            }
        }
        System.out.println("way2");
        for(Character x: hm.keySet())
        {
            if(hm.get(x)>=1)
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
         characters(str);
    }
    
}

