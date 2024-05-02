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

 public class IntersectionLL {
    public static int findIntersection(Node firstHead, Node secondHead) {
        //Write your code here
         if(firstHead==null || secondHead==null){
              return 0;
         }
         while(secondHead!=null){
              Node temp=firstHead;
              while(temp!=null){
                   if(temp==secondHead){
                        return secondHead.data;
                   }
                    temp=temp.next;

              }
               secondHead=secondHead.next;

         }
          return -1;
    }
}
