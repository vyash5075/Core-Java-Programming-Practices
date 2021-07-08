import java.util.*;
public class gfg{
    public static void main(String args[]){
        int intervals[][]={{2,1},{1,2},{1,4},{2,4},{4,2}};
        
         Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] array1, int[] array2) {
                if (array1[0] != array2[0])
                    return array1[0] - array2[0];
                else
                    return array2[1] - array1[1];
            }
        });
        
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<intervals[0].length;j++){
                System.out.print(intervals[i][j]+" ");
            }
            System.out.println();
            
        }
    }
}

//output: 

1 4 
1 2 
2 4 
2 1 
4 2 
