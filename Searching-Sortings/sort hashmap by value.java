import java.util.*;
public class gfg{
    public static void main(String args[]){
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("Math",98);
        hm.put("Data Structure",85);
        hm.put("java",91);
        hm.put("react",95);
        hm.put("csa",87);
        hm.put("adbms",67);
        Map<String,Integer>hm1=sortbyvalue(hm);
         for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                          ", Value = " + en.getValue());
    }
    }
    
    public static HashMap<String,Integer> sortbyvalue(HashMap<String,Integer>hm){
        
        
        //create a list from elements of HashMap
        List<Map.Entry<String,Integer>>list=new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
        
        //sort the list
        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){
            public int compare(Map.Entry<String,Integer>o1,Map.Entry<String,Integer>o2){
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        
        
        //put data from sorted list to HashMap
        HashMap<String,Integer>temp=new LinkedHashMap<String,Integer>();
        for(Map.Entry<String,Integer>aa:list){
            temp.put(aa.getKey(),aa.getValue());
        }
        return temp;
    }

}
