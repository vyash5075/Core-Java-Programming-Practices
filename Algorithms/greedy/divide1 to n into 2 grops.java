//https://www.geeksforgeeks.org/divide-1-n-two-groups-minimum-sum-difference/
//Divide 1 to n into two groups with minimum sum difference
/*Input : 5
Output : 2
         5 2
         3
         4 3 1
Here sum of group 1 is 7 and sum of group 2 is 8.
Their absolute difference is 1 which is minimum.
We can have multiple correct answers. (1, 2, 5) and 
(3, 4) is another such group.
*/

import java.util.*;
public class abc{
    public static void main(String args[]){
        int n=5;
        findTwoGroup(n);
    }
    public static void findTwoGroup(int n){
        int sum=n*(n+1)/2;
        int group1Sum=sum/2;
        ArrayList<Integer>al=new ArrayList<Integer>();
        ArrayList<Integer>al2=new ArrayList<Integer>();
        
        for(int i=n;i>0;i--){
        if(group1Sum-i>=0){
            al.add(i);
            group1Sum-=i;
        }
        else{
            al2.add(i);
            
        }
        }
        System.out.println(al);
        System.out.println(al2);
    }
}
