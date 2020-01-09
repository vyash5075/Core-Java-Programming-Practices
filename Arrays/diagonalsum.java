import java.util.*;
/**
 *   input: 1 2 3
 *          4 5 6
 *          7 8 9
 *     
 *  output :  1 25 81 
              9 25 49       

 * @author yash verma
 */
public class diagonalsum {
  
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
      System.out.println("enter the no. of rows");
      int rows=sc.nextInt();
      System.out.println("enter the no. of cols");
      int cols=sc.nextInt();
      int arr[][]=new int[rows][cols];
      for(int i=0;i<rows;i++)
      {
          for(int j=0;j<cols;j++)
          {
              arr[i][j]=sc.nextInt();
          }
      }
   
   int arr2[][]=new int[rows][cols];
   int d1=0;
   while(d1!=rows)
   {
       int a=arr[d1][d1];
       arr2[0][d1]=a*a;
       d1++;
   }
   int d2=0;
   while(d2!=rows)
   {
       int b=arr[d2][rows-d2-1];
       arr2[1][d2]=b*b;
       d2++;
   }
   System.out.println("diagonals square");
   for(int i=0;i<2;i++)
   {
       for(int j=0;j<cols;j++)
       {
           System.out.print(arr2[i][j]+" ");
       }
       System.out.println("");
   }
}
}