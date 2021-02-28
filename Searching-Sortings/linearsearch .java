
package searchingsorting;
import java.util.*;

public class linearsearch {
    public static int search(int a[],int key)
    {
        int n=a.length;              // here length is not a function its an attribute
        for(int i=0;i<n;i++)     
        {
            if(a[i]==key)
                return i;
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the element u want to search");
        int key=sc.nextInt();
        int index=search(a,key);
        if(index>0)
        {
            System.out.println("element is present at position "+index);
        }
        else{
            System.out.println(key+" does not exist");
        }
        
        
        
    }
}
// linear search is a worst case search where in the programmer tries to compare the element to be found with each and every element present in the array.
// this is a search technique which is generally not used  when search in the big data.like searching any one profile in whole world.
//time complaxity is related to linear search;
//worst case:-  in linear search the worst case will be the element is present at last index of array  or running time of worst case is (0)n  wigo of n .
// average case:- the element can be present from the index  1 to n-2 and can be found any where(0)n-2 wigo of n-2.
// best case:- when the key value is founf]d at the first index of arrayand riunning time is(0)(1).