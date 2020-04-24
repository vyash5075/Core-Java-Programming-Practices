/*Write a function to insert an integer into a circular linked _list whose elements are sorted in ascending order 9smallest to largest).
The input to the function insertSortedList is a pointer start to some node in the circular list and an integer n between 0 and 100. Return a pointer to the newly inserted node.

TestCase 1:
Input:
[3->4->6->1->2->^],5
Expected Return Value:
[5->6->1->2->3->4->^]
TestCase  2:
Input:
[1->2->3->4->5->^],0
Expected Return Value:
[0->1->2->3->4->5->^]

*/

import java.util.*;
public class circular_sortedaddition
{
    static void printList(Node head) 
{ 
    Node temp = head; 
    if (head != null) 
    { 
        do
        { 
            System.out.print(temp.data + " "); 
            temp = temp.next; 
        } 
        while (temp!= head); 
    } 
}
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
        }
    }
    
    static Node sortc(Node head,int data) {
     
     Node prev=head;
     Node h=head.next;
     
     if(head.data  > data) {
         Node c=new Node(head.data);
         c.next=head.next;
         head.data=data;
         head.next=c;
         
         return head;
     }
     
     while(h!=null && h!=head) {
         if(h.data  > data) {
             
             Node c=new Node(data);
             c.next=h;
             prev.next=c;
             return c;
             
         }
         prev=h;
         h=h.next;
     }
        return head;
    }
    
	public static void main(String[] args) {
	//	System.out.println("Hello World");
		Node head=new Node(3);
		head.next=new Node(4);
		head.next.next=new Node(6);
		head.next.next.next=new Node(1);
		head.next.next.next.next=new Node(2);
		head.next.next.next.next.next=head;
		Node r=sortc(head,5);
		
		System.out.println(r.data);
		printList(r);
	}
}