/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

 public class reverseDL
 {
     public static Node reverseDLL(Node head)
     {
         // Write your code here.
          Node curr=head;
           Node prev=null;
             Node next=null;
              while(curr!=null){
                   next=curr.next;
                    curr.next=prev;
                     curr.prev=next;
                      prev=curr;
                       curr=next;
 
              }
               head=prev;
                return head;
     }
 }