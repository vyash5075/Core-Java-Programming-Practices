/*input arr=2,3,5,5,20,80
target=17;
output 1,4
*/
import java.util.*;
public class gfg{
    public static void main(String args[]){
        int arr[]={2,3,5,5,20,80};
        int target=17;
        findpair(arr,target);
    }
    public static void findpair(int arr[],int target){
        Arrays.sort(arr);
        int i=0;
        int j=1;
        while(i<arr.length&&j<arr.length){
            if(arr[j]-arr[i]==target){
                System.out.println(i+"-"+j);
                return;
            }
            else if(arr[j]-arr[i]<target){
                j++;
            }
            else{
                i++;
            }
        }
             System.out.println("-1");
        return;
       
       
    }
}
