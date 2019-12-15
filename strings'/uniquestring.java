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
