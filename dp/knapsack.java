/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class knapsack {
    public static class  ItemValue{
        Double cost;
        double wt,value,index;
        ItemValue(int wt,int value,int index)
        {
            this.wt=wt;
            this.value=value;
            this.index=index;
            cost= new Double (value/wt);
        }
    }
    

public static double getmaxprofit(int wt[],int value[],int capacity)
{
    ItemValue storage[]=new ItemValue[wt.length];
    for(int i=0;i<wt.length;i++)
    {
        storage[i]=new ItemValue(wt[i],value[i],i);
    }
    Arrays.sort(storage,new Comparator<ItemValue>()
    {
        public int compare(ItemValue o1,ItemValue o2)
        {
            return o2.cost.compareTo(o1.cost);
        }
    });
    double totalvalue=0d;
    for(ItemValue i:storage)
    {
        int curwt=(int)i.wt;
        int curval=(int)i.value;
        if(capacity-curwt>=0)
        {
            capacity=capacity-curwt;
            totalvalue+=curval;
            
        }
        else{
            double fraction =((double )capacity/(double)curwt);
            totalvalue+=(curval*fraction);
            capacity=(int)(capacity-(curwt*fraction));
            break;
        }
    }
    return totalvalue;
}
    public static void main(String args[])
    {
       int[] wt = {10, 40, 20, 30}; 
        int[] value = {60, 40, 100, 120}; 
        int capacity = 50; 
        double total=getmaxprofit(wt,value,capacity);
        System.out.println(total);

    }
}
