import java.util.*;
/**
 *
 * @author yash verma
 */

 class cmprable_example {
    static public class Videos implements Comparable<Videos>{
    String videos;
    int price;
    Videos(String videos,int price)
    {
        this.videos=videos;
        this.price=price;
    }
    public int compareTo(Videos v)
    {
        if(price==v.price)
        {
            return 0;
        }
        else if(price>v.price)
                {
                    return -1;
                }
        else{
            return -1;
        }
    }
}
    public static void main(String args[])
    {
        ArrayList<Videos>al=new ArrayList<Videos>();
        al.add(new Videos("abc",10));
        al.add(new Videos("def",10));
        al.add(new Videos("ghi",15));
        al.add(new Videos("abc",13));
        al.add(new Videos("abc",12));
        al.add(new Videos("abc",10));
       Collections.sort(al);
       int i=0;
        for(Videos st:al)
        {  
            if(i<3)
            {
                System.out.println(st.videos+":"+st.price);  
                i++;
            }
            else{
                break;
            }
        }  
   
    }
}
