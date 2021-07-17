/* https://www.geeksforgeeks.org/maximum-trains-stoppage-can-provided/
Input : n = 1, m = 3
Train no.|Arrival Time|Dept. Time | Platform No.
    1    | 10:00      |  10:30    |    1
    2    | 11:10      |  11:30    |    1
    3    | 12:00      |  12:20    |    1
           
Output : Maximum Stopped Trains = 3
Explanation : All three trains can be easily
stopped at platform 1.
*/

import java.util.*;
public class abc{
    
    public static  class Chart{
        int arrival;
        int departure;
        Chart(int arrival,int departure){
            this.arrival=arrival;
            this.departure=departure;
        }
    }
    
    public static void main (String args[]){
        int n=2;//no of platforms
        int m=5;// no of trains
            int arr[][]={
                {1000, 1010, 1},
                {1006, 1020, 1},
                { 1025, 1040, 1},
                {1130, 1145, 2},
                { 1150, 1155, 2}
                
            };
            
            System.out.println("maximum stopped trains"+count(arr,m,n));
        
    }
    
    public static int count(int arr[][],int m,int n){
        int count=0;
        
        for(int i=0;i<n;i++){
            ArrayList<Chart>al=new ArrayList<>();
            for(int j=0;j<m;j++){
                if(arr[j][2]==i+1){
                    al.add(new Chart(arr[j][0],arr[j][1]));
                }
            }
            
            Collections.sort(al,(a,b)->a.departure-b.departure);
            count++;
            Chart a1=al.get(0);
            for(int l=1;l<al.size();l++){
                Chart a2=al.get(l);
                if(a2.arrival>=a1.departure){
                    System.out.println(a2.arrival);
                    count++;
                    System.out.println(count);
                    a1=a2;
                }
            }
             
            
        }
        return count;
    }
}
