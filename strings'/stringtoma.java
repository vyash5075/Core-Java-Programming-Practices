/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;
import java.util.Scanner;
/**
 *
 * @author yash verma
 */
public class ques40 {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s="";
    int num=1;
    while(num<=n)
    {  s=s+num+" ";
        num=num+2;
      
    }
   
    if(n%2!=0)
    {
        n=n-1;
    }
    while(n>=2)
    {
       // s=s+n+" ";
        n=n-2;
        
    }
    System.out.println(s);
}
}
