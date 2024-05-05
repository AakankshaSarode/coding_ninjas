import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

      class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data) {
            this.data = data;
        }
    }

*****************************************************************/

public class Solution {

public static ArrayList<int[]> findPairs(Node head, int k) {
        // Write your code here.
        ArrayList<int[]> res= new ArrayList<>();
         Node temp1=head;
          while(temp1!=null){
              Node temp2=temp1.next;
               while(temp2!=null){
                   if(temp1.data+temp2.data==k){
                        res.add(new int[]{temp1.data,temp2.data});
                   }
                    if(temp2.data>k){
                         break;
                    } temp2=temp2.next;

               }
                temp1=temp1.next;
          }
           return res;

    }

}
