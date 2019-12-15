import java.util.*;
public class getindex {
    public static void main(String args[])
    {
     String s1="my name is yash";
     System.out.println(s1.indexOf("s"));
     int n=s1.indexOf("s",20);  //becuse this string is smaller than index 20
     System.out.println(n);
     int m=s1.indexOf("s",10);
     System.out.println(m);
     System.out.println(s1.lastIndexOf("s"));                    //
     String s="mississippi";
     System.out.println(s.indexOf("i"));
      System.out.println(s.lastIndexOf("i"));
       System.out.println(s.indexOf("i",5));
    }
}
