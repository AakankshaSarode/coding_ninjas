/********************************************************

    Following is the class structure of the Node class:
    
    class Node
    {
        public:
            int data;
            Node next;
            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
    };

********************************************************/

public class Solution {
    public static Node uniqueSortedList(Node head) {
        // Write your code here.
         if(head==null || head.next==null){
              return head;

         }
          Node temp=head;
           while(temp!=null){
                Node nextNode=temp;
                 while(nextNode!=null &&nextNode.data==temp.data){
                     nextNode=nextNode.next;

                 }
                  temp.next=nextNode;
                   temp=temp.next;
           }
            return head;
    }
}