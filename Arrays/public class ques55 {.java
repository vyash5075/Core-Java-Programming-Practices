import java.util.*;
public class egg_problem {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of customers");
        int n=sc.nextInt();
        System.out.println("enter egg demands by each customer");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the no. of eggs shopkeeper has");
        int eggs=sc.nextInt();
        System.out.println("if shopkeeper has eggs less than demand it will take otherwise it will give it to customer");
        for(int i=0;i<n;i++)
        {
            if(eggs>=arr[i])
            {
                eggs=eggs-arr[i];
            }
            else{
                eggs=eggs+arr[i];
            }
        }
        System.out.println("at last the shopkeeper has left with "+eggs+" eggs");
    }
}
