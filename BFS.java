import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
 import java.util.*;
public class Solution {
    public static List<Integer> bfsTraversal(int n, List<List<Integer>> adj){
        Queue<Integer> q= new LinkedList<>();
        ArrayList<Integer> list= new ArrayList<>();
         boolean vis[]= new boolean[n];
          q.add(0);
          while(!q.isEmpty()){
                int curr= q.remove();
                 if(!vis[curr]){
                      vis[curr]=true;
                      list.add(curr);
                      for( int i=0;i<adj.get(curr).size();i++){
                            int e= adj.get(curr).get(i);
                            q.add(e);
                      }
                 }
           }
           return list;
          }
      }
      
      