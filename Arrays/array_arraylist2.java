public class array_arraylist2{
     public static void main(String args[])
    {
        int j=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
         List al = Arrays.asList(arr); 
        
        System.out.println(al); 
}
}
