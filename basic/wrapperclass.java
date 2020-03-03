import java.util.*;
public class wrapperclass {
    public static void main(String args[])
    {
        int a =10;
        int b=20;
        Integer ab=Integer.valueOf(a);               //  write explicitely
        Integer aabb=b;                             //direct autoboxing      converting primitive to object type
        System.out.println(aabb);                 //20
        System.out.println(ab);                     //10
        
        
        
        Integer t=new Integer(30);
        Integer t3=new Integer(40);
        int t2 =t.intValue();                 //wrote explicitely
        int t5=t3;                           //direct boxing      converting object to primitive type
        System.out.println(t5);                //40     
        System.out.println(t2);                         //30
        
    }
}
