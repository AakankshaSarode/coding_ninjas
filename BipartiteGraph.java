import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static boolean isGraphBirpatite(ArrayList<ArrayList<Integer>> edges) {

        // Write your code here
         HashMap<Integer,ArrayList<Integer>>  adj= new HashMap<>();
          int n= edges.size();
        int color[]= new int[n];
         for( int i=0;i<n;i++){
               color[i]=-1;
                adj.put(i,new ArrayList<>());

         }      
          for( int i=0;i<n;i++){
               for( int j=0;j<edges.get(0).size();j++){
                    if(edges.get(i).get(j)==1){
                         adj.get(i).add(j);
                          adj.get(j).add(i);

                    }
               }
          }   
           color[0]=0;
            Queue<Integer> que= new LinkedList<>();
             que.add(0);
             while(!que.isEmpty()){
                  int front= que.poll();
                   for( int it :adj.get(front)){
                        if(color[it]==-1){
                             color[it]=color[front]==0 ?1:0;
                              que.add(it);
                               
                        }
                         else if(color[it]==color[front]){
                              return false;
                         }
                   }
             } 
              return true;
    }
}