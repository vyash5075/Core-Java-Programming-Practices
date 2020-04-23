import java.util.*;
public class lrucacheimplementation {
    static int csize;
    static Deque<Integer>dq;
    static HashSet<Integer>map;
    lrucacheimplementation(int n)
    {
        map=new HashSet<>();
                dq=new LinkedList<>();
        csize=n;
    }
    public void refer(int n)
    {
        if(!map.contains(n))
        {
            if(csize==dq.size())
            {
                int last=dq.removeLast();
                map.remove(last);
            }
        }
        else{
            int index=0;
            int i=0;
            Iterator<Integer> itr=dq.iterator();
            while(itr.hasNext())
            {
                if(itr.next() == n) 
                { 
                    index=i;
                    break;
                }
                i++;
            }
            dq.remove(index);   
                }
        dq.push(n);
        map.add(n);
    }
    public void display(){
        Iterator<Integer>itr=dq.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()+" ");
        }
    }
    public static void main(String args[])
    {
        lrucacheimplementation l=new lrucacheimplementation(4);
        l.refer(1);
        l.refer(2);
        l.refer(3);
        l.refer(1);
        l.refer(4);
        l.refer(5);
        l.display();  
    }
}
