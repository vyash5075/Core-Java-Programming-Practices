//input : arr[]=8,3,1,2
//output: 29

//source: https://www.youtube.com/watch?v=yroWfS5P2E4&list=PL-Jc9J83PIiHhXKonZxk7gbEWsmSYP5kq&index=13
//tip: you can only rotate the element
import java.util.*;
public class gfg{
    public static void main(String args[]){
        int arr[]={8,3,1,2};
         int a= maximise(arr);
       System.out.println(a);
    }
    public static int  maximise(int arr[]){
        
         int sum=0;
         int s0=0;
         int n=arr.length;
         
         for(int i=0;i<arr.length;i++){
             sum=sum+arr[i];
             s0=s0+arr[i]*i;
         }
         
         int max=s0;
         int si=s0;
         for(int i=0;i<arr.length-1;i++){
             int sip1=si+sum-n*arr[n-i-1];
             if(sip1>max){
                 max=sip1;
             }
             si=sip1;
         }
         return max;
    }
}
