import java.util.*;
public class zerotriplet{
    public static void main(String args[]){
        int arr[]={0,-1,2,-3,1};
        boolean check=findtriplet(arr,0);
        if(check==false){
            System.out.println("no triplet found");
        }
    }
    
    public static boolean findtriplet(int arr[],int n){
        Arrays.sort(arr);
        int l;
        int  r;
        for (int i = 0; i < arr.length - 2; i++) {
            l = i + 1;  
            r = arr.length - 1;  
            while (l < r) {
                if (arr[i] + arr[l] + arr[r] == n) {
                    System.out.print("Triplet is " + arr[i] + ", " + arr[l] + ", " + arr[r]);
                    return true;
                }
                else if (arr[i] + arr[l] + arr[r] < n)
                    l++;
 
                else
                    r--;
            }
        }
        return false;
    }
}
