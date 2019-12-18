import java.util.*;

public class array_arraylist3 {
     public static void main(String args[])
    {
       /* int j=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }*/
        String[] geeks = {"Rahul", "Utkarsh", 
                          "Shubham", "Neelam"}; 
  
      List<String> al =  new ArrayList<String>(Arrays.asList(geeks)); 
        System.out.println(al); 
       al.add("Shashank"); 
        al.add("Nishant"); 
          System.out.println(al); 
    }
}
