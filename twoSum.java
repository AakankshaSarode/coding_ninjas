import java.awt.Container;
import java.util.*;
public class Solution {
    public static String read(int n, int []book, int target){
        // Write your code here.
        Arrays.sort(book);
         int i=0,j=n-1;
           while(i<j){
              if( book[i]+book[j]==target){
                  return "YES";

              } if(book[i]+book[j]>target)
              j--;
               else  i++;

           }
       HashMap<Integer,Integer>map=new HashMap<>();
        for(  i=0;i<n;i++){
             if(map.containsKey(book[i]))
             map.put(book[i],1);
              else map.put(book[i],0);
        }
        for(i=0;i<n;i++){
             int remain=target-book[i];
              if(map.containsKey(remain)) return "YES";
        }
        return "NO";
    }
}