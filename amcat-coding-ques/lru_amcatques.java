
package amcat;
import java.util.*;

/**
 *
The least recently used(lru) algorithm exists the elements from the cache(when it's full) that was least recently used.After an element is requested from the cache, it should beadded to the cache (if not already there) and considered the most recently used element in the cache.

Test case 1:
3
16
7 0 1 2 0 3 0 4 2 3 0 3 2 1 2 0
output:
11

Test case 2:
2
9
2 3 1 3 2 1 4 3 2
 */
public class lru_amcatques {
    public static void main(String[] args)
 {
    Scanner sc =new Scanner(System.in);
    int ps=sc.nextInt();     //read the cache size
    int as=sc.nextInt();      //size of the page array
    int[] a=new int[as];
    for(int i=0;i<as;i++)     //get the page elemnts
    a[i]=sc.nextInt();
    System.out.println(lrucountmiss(a,ps));
 
 }
 public static int getMinValue(int[] array)
 {
     
     int j=0, minValue = array[0];
        for (int i = 1; i < array.length; i++)
        {
             if (array[i] < minValue) 
             {
                 j=i;
             }
     }
     return j;
 }
public static int Search(int[] array,int e) {
     for (int i = 1; i < array.length; i++) 
         if (array[i] == e) 
             return i;
         return -1;
 }
 static int lrucountmiss(int a[],int ps)
{
 int[] page=new int[ps];
 int[] cach=new int[ps];
 int c=0,j=0,k=0;
 Arrays.fill(page, -1);
 for(int i=0;i<a.length;i++)
 {
  int t=Search(page,a[i]);
//  System.out.println(t); 
  if(t==-1)
   {
   if(j<ps)
    {
    page[j]=a[i];
       cach[j]=k++;
       j++;
       }
   else
   {
    int min=getMinValue(cach);
    page[min]=a[i];
    cach[min]=k++;
   }
   c++;
   }
  else
   cach[t]=k++;
 }
return c;
}

}

