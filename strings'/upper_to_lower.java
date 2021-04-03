
package strings;
import java.util.*;

public class ques4 {
    public static void convert(String str)
    {
        int len=str.length();
       
       
        for(int i=0;i<len;i++)
        {
            int ch=str.charAt(i);
            if(ch>=65&&ch<=90)
            {
                ch=ch+32;
            }
           else if(ch>= 97&&ch<=122)
            {
                ch=ch-32;
            }
            if(ch==32)
            {
                System.out.print(" ");
            }
            System.out.print((char)ch);  
        }  
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String str=sc.next();
        convert(str);
        
        
    }
}
-------------------------------------------------------------
//way2
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
public class ques5 {
        public static void convert(String str)
    {
        int len=str.length();
       StringBuffer st=new StringBuffer(str);
        for(int i=0;i<len;i++)
        {
           
            if(Character.isLowerCase(str.charAt(i)))
            {
                st.setCharAt(i,Character.toUpperCase(str.charAt(i)));
            
        }
            if(Character.isUpperCase(str.charAt(i)))
            {
                st.setCharAt(i,Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println(st);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String str=sc.next();
        
        convert(str);
        
        
    }
}


-------------------------------------------------------------------
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
public class ques8 {
    public static void convert(String str)
    {
        int len=str.length();
       // System.out.print(len);
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                System.out.print(Character.toLowerCase(ch));
            }
            else{
                System.out.print(Character.toUpperCase(ch));
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the string");
        String str= sc.nextLine();
        convert(str);
    }
}
------------------------------------------------------------------------------------
//way4
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
public class ques9 {
    public static String convert(String str)
    {
        int len=str.length();
        char ch[]=str.toCharArray();
       
       
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='a'&&ch[i]<='z')
            {
               int n =ch[i];
               n=n-32;
              // ch[i]=(char)n;
               ch[i]=(char)(ch[i]-'a'+'A');
            }
            else  if(ch[i] == ' ')
            {
                ch[i]=ch[i];
            }
           
            
           else {
               int n =ch[i];
               n=n+32;
               ch[i]=(char)n;
            }     
        }     
    String s=new String(ch);
        return s;
    }   
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str= sc.nextLine();
        String s=convert(str);
        System.out.print(s);
    }
}
