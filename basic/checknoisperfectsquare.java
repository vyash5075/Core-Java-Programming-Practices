/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.*;

/**
 *
 * @author yash verma
 */
public class checknoisperfectsquare {
    public static void checkfibo(int n)
    {
        int a=(5*n*n+4);
        int b=(5*(n*n)-4);
        if((checkpefectsq(a))||(checkpefectsq(b)))
                {
                    System.out.println("yes");
                }
        else{
            System.out.println("no");
        }
    }
    public static boolean checkpefectsq(int a)
    {
        double sq=Math.sqrt(a);
        return(sq-Math.floor(sq)==0);
    }
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    checkfibo(n);
}
        
}
