import java.util.*;
/**
 *
 * @author yash verma
 */
public class trycatch {
    public static void main(String args[]){
        try{
        int a=10;
        int b=0;
        int c=a/b;
        System.out.println(c);
    }
         
        catch(ArithmeticException e)
        {
            System.out.println("invalid");    //zero
            System.out.println(e);          //java.lang.ArithmeticException: / by zero
            System.out.println(e.toString());    //java.lang.ArithmeticException: / by zero
           // e.printStackTrace();       //java.lang.ArithmeticException: / by zero at array.trycatch.main(trycatch.java:17)
         System.out.println("jk"+e.getMessage());        /// by zero
         
        }
//         System.out.println("hi");                        gives error if i write here
        finally{
            System.out.println("i am in finally block");
        }
        System.out.println("hi");
       
    }
}
//output:  
//invalid
//java.lang.ArithmeticException: / by zero
//java.lang.ArithmeticException: / by zero
//jk/ by zero
//i am in finally block
//hi