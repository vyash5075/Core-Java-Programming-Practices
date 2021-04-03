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
public class ques41 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s);
        String arr[]=s.split("\\s+");
        String k="";
        for(int i=arr.length-1;i>=0;i--)
        {
         String st=arr[i];
        String y="";
        for(int j=st.length()-1;j>=0;j--)
        {
            y+=st.charAt(j);
        }
        k+=y+" ";
        }
        System.out.println(k);
       
    }
}
