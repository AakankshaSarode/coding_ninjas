
import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
         int ans[]= new int[n];
          int j=0;
          for( int i=1;i<n;i++){
                ans[j++] =arr[i];
                 
          } for(int i=0;i<1;i++){
               ans[j++]= arr[i];

          }
          return ans;

    }
}