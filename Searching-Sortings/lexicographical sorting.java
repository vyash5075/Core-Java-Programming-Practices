import java.util.*;
public class abc{
public static void main(String args[]){
    String arr[]= { "10", "5","15","22","32","100","40" };
    
    sort(arr);
}
public static void sort(String arr[]){
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i].compareToIgnoreCase(arr[j])>0){
                String temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
        
        int ar1[]=new int [arr.length];
        
        for(int i=0;i<arr.length;i++){
            ar1[i]=Integer.parseInt(arr[i]);
        }
        
         for(int i=0;i<arr.length;i++){
          System.out.println(ar1[i]);
    }
}
}
