//output=34
//https://www.geeksforgeeks.org/split-n-maximum-composite-numbers/
//return maximum composite no sum upto n

import java.util.*;
public class abc{
    public static void main(String args[]){
        int n=143;
        System.out.println(count(n));
    }
    public static int count(int n){
        int rem=n%4;
        if(rem==0){
            return n/4;
        }
        if(rem==1){
            if(n<9){
                return -1;
            }
            return (n-9)/4+1;
        }
        else if(rem==2){
            return (n-6)/4+1;
        }
        else if(rem==3){
            if(n<15)return -1;
            return (n-15)/4+2;
        }
        return -1;
    }
}
