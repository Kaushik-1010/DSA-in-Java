package DLLDeleteNode;

import java.util.*;
class Node{

    int data;
    Node next;
    Node prev;

    Node (int x)
    {
        data = x;
        next = null;
        prev = null;
    }
}
class LinkedList{

    static Node insert (Node head, int data)
    {

        Node newNode = new Node (data);
        newNode.next = head;
        //If the linked list already had atleast 1 node
        if (head != null)
            head.prev = newNode;
        //changing the new head to this freshly entered node
        head = newNode;

        return head;
    }

    static void display (Node node)
    {
        //as linked list will end when Node is Null
        Node end = null;

        System.out.println ("List in forward direction");
        while (node != null)
        {
            System.out.print (node.data + " ");
            end = node;
            node = node.next;
        }
        System.out.println ("\nList in backward direction");
        while (end != null)
        {
            System.out.print (end.data + " ");
            end = end.prev;
        }
        System.out.println ("\n");
    }

    static Node deleteNode (Node head, int delVal)
    {

        Node temp = head;
        Node previous = null;
        //Case when there is only 1 node in the list

        if (temp.next == null)
        {
            head = null;
            System.out.println ("Value, deleted: " + delVal);
            return head;
        }
        //if the head node itself needs to be deleted
        if (temp != null && temp.data == delVal)
        {
            //Case 1 head becomes 30
            head = temp.next;	//changing head to next in the list
            head.prev = null;	//assigning new head's previous value to NULL
            //case 1: 22 deleted and freed
            System.out.println ("Value deleted: " + delVal);
            return head;
        }
        //run until we find the value to be deleted in the list
        while (temp != null && temp.data != delVal)
        {
            //store previous link node as we need to change its next val
            previous = temp;
            temp = temp.next;
        }
        //if value is not present then
        //temp will have traversed to last node NULL
        if (temp == null)
        {
            System.out.println ("Value not found");
            return head;
        }
        // Case 2: (24)->next = 16 (as 20->next = 16)
        // Case 3: (16)->next = NULL (as 12->next = NULL)
        previous.next = temp.next;

        //If the last node is to be deleted
        if (temp.next == null)
        {
            // Case 3: Just need to free the memory
            System.out.println ("Value deleted: " + delVal);
            return head;
        }

        Node temp2 = null;
        // Case 2 : temp2 = 20->next = 16
        temp2 = temp.next;
        temp2.prev = previous;
        //case 2: 20 deleted and freed
        System.out.println ("Value deleted: " + delVal);

        return head;
    }

    public static void main (String args[])
    {
        Node head = null;

        head = insert (head, 12);
        head = insert (head, 16);
        head = insert (head, 20);
        head = insert (head, 24);
        head = insert (head, 30);
        head = insert (head, 22);

        display (head);
        //deleting first occurrence of a value in linked list
        head = deleteNode (head, 22);
        display (head);

        head = deleteNode (head, 20);
        display (head);

        head = deleteNode (head, 12);
        display (head);

        head = deleteNode (head, 30);
        display (head);

        head = deleteNode (head, 16);
        display (head);

        head = deleteNode (head, 24);
        display (head);

    }
}
