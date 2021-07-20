/*

https://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/
arr[]  = {9:00,  9:40, 9:50,  11:00, 15:00, 18:00}
dep[]  = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}

ans=3
*/




import java.util.*;
public class abc{
    public static void main(String args[]){
        int arrival[]={ 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n=arrival.length;
        System.out.println("Minimum no. of paltforms required are "+findplatforms(arrival,dep,n));
    }
    public static int findplatforms(int arr[],int dep[],int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int platformneeded=1;
        int result=1;
        
        int i=1;
        int j=0;
        
        while(i<n&&j<n){
            if(arr[i]<=dep[j]){
                platformneeded++;
                i++;
            }
            else if(arr[i]>dep[j]){
                j++;
                platformneeded--;
                
            }
            if(platformneeded>result){
                result=platformneeded;
            }
        }
        return result;
        
    }
}
