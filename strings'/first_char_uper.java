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
public class ques10 {
    public static void convert(String s)
    {
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        { 
            if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ')
            {
              
                if(ch[i]>='a'&&ch[i]<='z')
                { 
                    ch[i]=(char)(ch[i]-'a'+'A');
                }
            }
            else if(ch[i]>='A'&&ch[i]<='Z')
                {
                     
                    ch[i]=(char)(ch[i]+'a'-'A');
                }
                
            }
        String str=new String(ch);
        System.out.print(str);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String s=sc.nextLine();
        convert(s);
    }
}
