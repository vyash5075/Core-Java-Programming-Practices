/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.*;
/**
 *Binary representation of 7: 
111

Binary representation of 45: 
101101

Binary representation of 999: 
1111100111
 */
public class decimaltobinary_Bystack {
     public static void main(String a[]){
    	        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        Stack<Integer>s=new Stack<>();
        while(n!=0)
        {
            int d=n%2;
            s.push(d);
            n/=2;
        }
        while(!s.isEmpty())
        {
            System.out.print(s.pop());
        }
        System.out.println();
    }
}
