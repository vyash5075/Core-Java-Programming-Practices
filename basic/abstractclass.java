import java.util.*;
abstract class bank{
    bank()
    {
        System.out.println("welcome to abatract class");
    }                                       // we can also create constructor in abstract class
    abstract void rateofinterest();
   public void banks()
   {
       System.out.println("sbi");
        System.out.println("pnb");
   }
}
class sbi extends bank{
    public void rateofinterest()
    {
    System.out.println("9");
}
}
class pnb extends bank{
    public void rateofinterest()
    {
    System.out.println("10");
}
}
public class abstractclass {
    public static void main(String args[])
    {
        bank b=new pnb();
        b.rateofinterest();          //10
        bank p=new sbi();
        p.rateofinterest();    //9
        b.banks();                //sbi    pnb
        
    }
}
