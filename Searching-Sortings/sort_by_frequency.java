import java.util.*;
public class abc{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5};
         Map<Integer,Integer>hm=new HashMap<>();
         List<Integer>outputarray=new ArrayList<>();
         for(int current:arr){
             int count=hm.getOrDefault(current,0);
             hm.put(current,count+1);
             outputarray.add(current);
         }
         SortComp comp=new SortComp(hm);
         Collections.sort(outputarray,comp);
            for(Integer i:outputarray){
                System.out.print(i+" ");
            }
    }
}
      class SortComp implements Comparator<Integer>{
        private final Map<Integer, Integer> freqMap;
        SortComp(Map<Integer, Integer> tFreqMap)
    {
        this.freqMap = tFreqMap;
    }
    
    public int compare(Integer k1, Integer k2){
        int freqcompare=freqMap.get(k2).compareTo(freqMap.get(k1));
        
        int valuecompare=k1.compareTo(k2);
        if(freqcompare==0)return valuecompare;
        else return freqcompare;
    }
    }
    
