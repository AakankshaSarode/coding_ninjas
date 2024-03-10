public class Solution {
    public static int findNumOfProvinces(int[][] roads, int n) {
        // Write your code here.
     boolean v[]=new boolean[n];
          int ans=0;
           for( int i=0;i<n;i++){
                if(!v[i]){
                     ans++;
                      dfs(n,roads,v,i);
                }
           } 
            return ans;

    }
     public static void dfs( int n, int [][]r, boolean[]v, int curr){
          v[curr]= true;
           for( int j=0;j<n;j++){
                if(curr==j)
                {
                     continue;
                }
                 else if( r[curr][j]==1){
                      if(!v[j]){
                           dfs(n, r, v, j);
                      }
                 }
           }
     }
}
