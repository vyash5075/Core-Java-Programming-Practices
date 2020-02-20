package array;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class fibonacci {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=0;
        int n2=1;
        int n3;
        System.out.print(n1+" "+n2);
        for(int i=2;i<n;i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
