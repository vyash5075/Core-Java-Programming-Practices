/*

https://www.geeksforgeeks.org/minimum-rotations-unlock-circular-lock/

Input : Input = 2345, Unlock code = 5432 
Output : Rotations required = 8
Explanation : 1st ring is rotated thrice as 2->3->4->5
              2nd ring is rotated once as 3->4
              3rd ring is rotated once as 4->3
              4th ring is rotated thrice as 5->4->3->2

Input : Input = 1919, Unlock code = 0000 
Output : Rotations required = 4
Explanation : 1st ring is rotated once as 1->0
              2nd ring is rotated once as 9->0
              3rd ring is rotated once as 1->0
              4th ring is rotated once as 9->0
*/
import java.util.*;
public class abc{
    public static void main(String args[]){
        int n=28756;
        int unlockcode=98234;
        System.out.println("Minimum Rotation = "+minimumrotations(n,unlockcode));
        
    }
    public static int minimumrotations(int input,int output){
        int rotations=0;
        int inputdigit;
        int codedigit;
        
        while(input>0||output>0){
            inputdigit=input%10;
            codedigit=output%10;
            rotations+=Math.min(Math.abs(inputdigit-codedigit),10-Math.abs(inputdigit-codedigit));
            input=input/10;
            output=output/10;
        }
        return rotations;
    }
}
