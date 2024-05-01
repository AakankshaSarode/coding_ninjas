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

public class removeKthNode
{
    public static Node removeKthNode(Node head, int K)
    {
        // Write your code here.
         int size=0;
          Node temp=head;
           while(temp!=null){
                temp=temp.next;
                 size++;

           } temp=head;
            if(K==size){
                head=head.next;
                return head;

            }
            int toDelete=size-K-1;
             int i=0;
              while(i!=toDelete){
                   i++;
   temp=temp.next;
              }
               temp.next=temp.next.next;
           
return head;
             
    }
}