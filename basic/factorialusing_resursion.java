package array;
import java.util.*;

/**
 *
 * @author yash verma-
 */
public class factorialusing_resursion{
    public static int factorial(int n)
    {
        int output;
        if(n==1)
        {
            return 1;
        }
        else{
            output=factorial(n-1)*n;
        }
        return output;
    }
public static void main(String args[])
{
    int k;
    int fact=1;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=factorial(n);
    System.out.println(m);
}
}
