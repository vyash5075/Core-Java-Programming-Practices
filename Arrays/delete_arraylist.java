import java.util.*;

public class delete_arraylist {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new  int[n];
        for(int i =0;i<n;i++)
        {
         arr[i]=sc.nextInt();
        }
        System.out.println("enter an element u want to delete");
        int item=sc.nextInt();
        ArrayList a=new ArrayList<>();
        for(int m:arr)
        {
            if(m==item)
            {
                a.remove(item);
            }
        
            
        }
        System.out.println("new array"+a);
    }
    
}
