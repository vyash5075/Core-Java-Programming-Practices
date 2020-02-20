package array;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class fibonacci_using_recursion {
public static int fibonacci(int m)
{
    if(m==0)
    {
        return 0;
    }
    if(m==1||m==2)
    {
        return 1;
    }
    return fibonacci(m-1)+fibonacci(m-2);
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
           System.out.print(fibonacci(i)+" ");
        }
    }
}
