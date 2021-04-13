    package strings;
    import java.util.*;
    
    /*
    input=> 
    [[1,3],[6,9]]
    [2,5]
    output=>
   [[1,5],[6,9]]
    */
     class newbie {
         static String max;
         public static void main(String args[]){
             Scanner sc=new Scanner(System.in);
         int interval[][]={{1,3},{6,9}};
         int newinterval[]={2,5};
        
     }
         
         public static  int[][] insert(int[][] intervals, int[] newInterval) {
       List<int []>result=new ArrayList<>();
        for(int[] in:intervals){
            if(in[1]<newInterval[0]){
                result.add(in);
            }
            else if(newInterval[1]<in[0]){
                result.add(newInterval);
                newInterval=in;
            }
            
            else{
                newInterval[0]=Math.min(newInterval[0],in[0]);
                 newInterval[1]=Math.max(newInterval[1],in[1]);
               
            }
        }
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
    }
    
     }
         
     
