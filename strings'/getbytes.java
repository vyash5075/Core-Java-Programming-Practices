import java.util.*;
public class getbytes {
    public static void main (String args[])
    {
        String s1="yash verma";
        byte br[]=s1.getBytes();
        for(int i=0;i<br.length;i++)
        {
            System.out.println(br[i]);
        }
       String s2 = new String(br);  
        System.out.println(s2);  

    }
}
