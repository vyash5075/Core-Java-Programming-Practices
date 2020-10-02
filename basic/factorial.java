package array;
import java.util.*;

/**
 *
 * @author yash verma
 */
public class factorial {
public static void main(String args[])
{
    int k;
    int fact=1;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    /*
    for(int i=n;i>=1;i--)
    {
        fact=fact*i;
    }*/
    System.out.println(fac(int n);
           
}
     public static int fac(int n)
    {
        if(n>=1)
        return n*fac(n-1);
        else
        return 1;
    }
}
