//Given an array of n integers where each value represents number of chocolates in a packet. Each packet can have variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:

//Each student gets one packet.
//The difference between the number of chocolates in packet with maximum chocolates and packet with minimum chocolates given to the students is minimum.
//Examples:

//Input : arr[] = {7, 3, 2, 4, 9, 12, 56}
//m = 3
//Output: Minimum Difference is 2
//We have seven packets of chocolates and
//we need to pick three packets for 3 students
//If we pick 2, 3 and 4, we get the minimum
//difference between maximum and minimum packet
//sizes.


import java.util.*;
public class chocolateproblem {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of packets of chocolates");
        int packets=sc.nextInt();
        System.out.println("enter the no. of chocolates in packets");
        int arr[]=new int[packets];
        for(int i=0;i<packets;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the no. of students");
        int students=sc.nextInt();
        Arrays.sort(arr);
        int mindiff=arr[students-1]-arr[0];
        System.out.println("min difference is"+mindiff);
    }
}
