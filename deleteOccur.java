
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
     Node(int data, Node next, Node prev)
     {
         this.data = data;
         this.next = next;
         this.prev = prev;
     }
 }

 *****************************************************************/

 public class deleteOccur {
    public static Node deleteAllOccurrences(Node head, int k) {
        // Write your code here.
         Node temp=head;
          while(temp!=null){
               if(temp.data==k){
                if(temp==head){
                     head=head.next;
                }
                 Node preNode=temp.prev;
                  Node nextNode=temp.next;
                  if(preNode!=null)
                   preNode.next=nextNode;
                    if(nextNode!=null)
                    nextNode.prev=preNode;
                     temp=nextNode;

          }
           else{
                temp=temp.next;
           }
    }
     return head;
}
}
