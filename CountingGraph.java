public class Solution {
    public static int countingGraphs(int N) {
        // Write your code here.
         if(N==0 ||N==1){
              return N;

         }
         return (int)Math.round(Math.pow(2,N*(N-1)/2));
    }
}
