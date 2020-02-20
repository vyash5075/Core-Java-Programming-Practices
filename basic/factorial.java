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
    for(int i=n;i>=1;i--)
    {
        fact=fact*i;
    }
    System.out.println(fact);
           
}
}
