/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;
import java.util.*;
/**   input:abc
 *    output:abc,acb,bca,bac,cab,cba
 *
 * @author yash verma
 */
public class ques38 {
    public static String swap(String a,int i,int j)
    {
        char arr[]=a.toCharArray();
        char ch;
        ch=arr[i];
        arr[i]=arr[j];
        arr[j]=ch;
       
        return new String(arr);
    }
    public static void generatepermutations(String str,int start,int end)
    {   
        if(start==end-1)
        {
            System.out.println(str);
        }
        else  
        {  
            for (int i = start; i < end; i++)  
            {
                str = swap(str,start,i); 
                 
                generatepermutations(str,start+1,end);  
               // str = swap(str,start,i); 
               // System.out.println("ssaaaaaaaass"+str);
            }  
        }    
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        generatepermutations(str,0,len);
    }
} 


---------------------------------------------------------------------------------
//way2  recursion
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
public class permutations2 {
    
    public static void generatepermutations(String str,String asf){
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String leftpart=str.substring(0,i);
            String rightpart=str.substring(i+1);
            String roq=leftpart+rightpart;
            //asf+=ch;
            generatepermutations(roq,asf+ch);
            
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        String str=sc.nextLine();
        generatepermutations(str,"");
    }
}

