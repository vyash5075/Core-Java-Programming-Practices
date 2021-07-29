//input 4320
//output: four three two zero
import java.util.*;
public class abc{
public static void main(String args[]){
    int n=4320;
    String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    printspell(n,arr);
}

public static void printspell(int n,String str[]){
    if(n==0)return;
     
    printspell(n/10,str);
    int k=n%10;
    
    System.oaut.print(str[k]+ " ");
   
}
}
