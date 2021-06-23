/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	int arr[]={1,2,0,1,2,0,1,2,0};
	sort(arr,arr.length);
	printarr(arr);
	
	}
	
	public static void printarr(int arr[]){
	    for(int i=0;i<arr.length;i++){
	        System.out.println(arr[i]);
	    }
	    
	}
	public static void sort(int a [],int len){
	  int lo = 0;
        int hi = len - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            switch (a[mid]) {
            case 0: {
                temp = a[lo];
                a[lo] = a[mid];
                a[mid] = temp;
                lo++;
                mid++;
                break;
            }
            case 1:
                mid++;
                break;
            case 2: {
                temp = a[mid];
                a[mid] = a[hi];
                a[hi] = temp;
                hi--;
                break;
            }
            }
        }
	}
}
