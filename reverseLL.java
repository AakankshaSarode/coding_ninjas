/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

 public class Solution
 {
     public static Node reverseLinkedList(Node head)
     {
         // Write your code here.
      Node curr= head;
       Node prev=null;
        Node temp=null;
         while(curr!=null){
              temp=curr.next;
               curr.next=prev;
             prev=curr;
              curr=temp;
         }
          return prev;
     }
 }
 