he main() method has been implemented for you. We emphasize the submission of a fully working code over partially correct but efficient code. Using certain java packages is restricted. You can use System.out.println to debug your code. The version of JDK being used is 1.7.

Given a linked list, reverse the second half of the linked list. That is, the linked list from the middle node to the last node should get reversed.

for example, if the linked list is {2->3->6->1->4->8->9->7}
then the resulting list would be {2->3->6->1->7->9->8->4}

The input to the method reversedLinkedList of class ReverselLinkedList  consists of an object list of class LNode representing a linked list.
The method returns an object of LNode representing a linked list which is reversed after the middle element.

If there is an odd number elements in the list, then the middle element will be part of the portion reversed. The middle element is the one located at position (N+1)/2, where N is the total number of element in the list.

The class to follow for a node of the linked list is –

public class LNode
{
 public int value;
public LNode next;
}

The class shall be followed for providing the inputs and used to evaluate your output.
it has been included for you by default in your code. You do not have to write this definition again.

Test cases

Test Case 1
Input:
1->2->3->4->null
Expected Return Value:
1->2->4->->3->null

Test Case 2
Input:
11->23-> 16->9->21->null
Expected Return Value:
11->23->21->9->16->null




package ds1;
import java.util.*;

public class main {
    static Node head;

    static class Node {

        Node next;
        int data;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static main insert(main l1, int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }

            cur.next = newNode;
        }
        return l1;
    }

    static void display(main l1) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    static main reverse(main l1) {
        Node prev = null;
        Node cur = head;
        int c = 0;
        while (cur != null) {
            c++;
            cur = cur.next;
        }
        int m = (c / 2) + 1;
        int n = c;
// System.out.println("total is "+c);
// System.out.println("mid is "+((c/2)+1));

        cur = head;
        while (m > 1) {
            prev = cur;
            cur = cur.next;
            m--;
            n--;
        }
        Node connection = prev;
        Node tail = cur;
        while (n > 0) {
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            n--;
        }
        if (connection != null) {
            connection.next = prev;
        } else {
            head = prev;
        }
        tail.next = cur;
        return l1;
    }

    public static void main(String[] args) {
        main li = new main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int z = sc.nextInt();
            insert(li, z);
        }
        display(li);
        System.out.println("\nafter reverse mid ");
        reverse(li);
        display(li);
    }
}