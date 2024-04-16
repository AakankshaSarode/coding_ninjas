public class Solution {
    public static int isSorted(int n, int []a) {
        // Write your code here.
         for( int i=0;i<n;i++){
              for( int j=i+1;j<n;j++){
                   if(a[j]<a[i])
                   return 0;
              }
         }
         return 1;
    }
}