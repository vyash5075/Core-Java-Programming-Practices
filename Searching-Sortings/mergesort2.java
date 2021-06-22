import java.util.*;
public class abc{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,1,0};
        sort(arr,0,arr.length-1);
         printarr(arr);
    }
    
    public static void sort(int arr[], int start, int end)
    {
        if (start < end) {
            int mid =start+ (end-start)/2;
            sort(arr, start, mid);
            sort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }
         public static void merge(int arr[], int start, int mid, int end)
    {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int leftarr[] = new int[n1];
        int rightarr[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            leftarr[i] = arr[start + i];
        for (int j = 0; j < n2; ++j)
            rightarr[j] = arr[mid + 1 + j];
        int i = 0, j = 0;
        int k = start;
        while (i < n1 && j < n2) {
            if (leftarr[i] <= rightarr[j]) {
                arr[k] = leftarr[i];
                i++;
            }
            else {
                arr[k] = rightarr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftarr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] =rightarr[j];
            j++;
            k++;
        }
       
    }
    
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
 
    
}
