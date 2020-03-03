import java.util.*;
interface a1{
    public abstract void test();
}
interface a{
    public abstract void test2();
}
public class interface_example implements a1 ,a{
    public void test()
    {
        System.out.println("interface a1 xecuted");
    }
    public void test2(){
        System.out.println("interface a executed");
    }
    public static void main(String args[])
    {
        interface_example t=new interface_example();
        t.test();  
        t.test2();
    }
}
