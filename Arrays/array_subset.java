public class array_subset {
    public static  void gensubset(int arr[],int reqlength,int start,int currentlen,int length,boolean check[])
    {
        //return if current length is more than given length
        if(currentlen>reqlength)
        {
            return;
        }
        //if currlengthis qual to reqlength then print the seuence
        
        else if(currentlen==reqlength)
        {
            System.out.print("{");
            for(int i=0;i<length;i++)
            {
                if(check[i]==true){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.print("}");
            return;
        }
        if(start==length)
        {
            return;
        }
    
    check[start]=true;
    gensubset(arr,reqlength,start+1,currentlen+1,length,check);
    
    
    check[start]=false;
    gensubset(arr,reqlength,start+1,currentlen,length,check);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of entries ");
        int n=sc.nextInt();
        int arr[]=new int[n];
         boolean check[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            check[i]=false;
        }
       
        System.out.println("subsets of array are");
         System.out.print("{ }");
        for(int i=1;i<=n;i++)
        {
            gensubset(arr,i,0,0,n,check);
        }
       
    }
}
