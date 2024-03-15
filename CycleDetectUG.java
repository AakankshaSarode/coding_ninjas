import java.util.List;
public class Solution {
    static class Graph {
        boolean detectCycle(int V, List<List<Integer>> adj) {
            // Write your code here.
             boolean v[]= new boolean[V];
              for( int i=0;i<V;i++){
                   if(!v[i]){
                   if(dfs(adj,v,i,-1))
                
                    return true;
              }
              }
               return false;
        }

    
     boolean dfs(List<List<Integer>> adj, boolean v[], int curr, int par){
          v[curr]= true;
           for( int  i=0;i<adj.get(curr).size();i++){
                int e= adj.get(curr).get(i);
                 if(v[e] && e!=par){
                      return true;

                 }
                 else if(!v[e]){
                      if(dfs(adj,v,e,curr))
                       return true;
                 }
           }
            return false;
     }
}
}
