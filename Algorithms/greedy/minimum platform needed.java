import java.util.*;
public class gfg{
    public static void main(String args[]){
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = arr.length;
        System.out.println("Minimum Number of Platforms Required = "
                           + findPlatform(arr, dep, n));
    }
    
    public static int findPlatform(int arr[],int dep[],int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int plat_needed=1;
        int result=1;
        int j=0;
        int i=1;
        while(i<n&&j<n){
            if(arr[i]<=dep[j]){
                i++;
                plat_needed++;
            }
            else if(arr[i]>dep[j]){
                plat_needed--;
                j++;
            }
            
            if(plat_needed>result){
                result=plat_needed;
            }
        }
        return result;
    }
}
