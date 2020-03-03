package array;
import java.util.*;
/**
 *
 * @author yash verma
 */
class youngerage extends RuntimeException{
    youngerage()
    {
//        super(s);
    }
    
}
public class customexception {
    public static void main(String args[])
    {
        int age=16;
        try{
            if(age<18)
            {
                throw new youngerage();             //throw keyword create object of runtime exception
            }
            else{
                System.out.println("eligible");
            }
        }
        catch(youngerage e)
        {
            System.out.println("not eligible");
        }
            
    }
}
//output:not elig