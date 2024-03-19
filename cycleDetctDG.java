import java.util.ArrayList;

import java.util.List;

 

public class Solution 

{

    // Function for checking is cycle exist or not-:

    public static Boolean checkCycle(int r, int vis[], List<List<Integer>> adj){

        vis[r] = 1;     // mark vertex visited

    // traverse to its connected vertices

        for(int i : adj.get(r)){

            if(vis[i] == 1) return true;   // if any of those already visited it means there exist cycle

        // otherwise if not visited so go depthwise to detect cycle

            if(vis[i] == 0 && checkCycle(i, vis, adj) == true) return true;

        }

        vis[r] = 0;     // if vertex r not forms cycle unmarked it

        return false;      

    }

    public static Boolean isCyclic(int[][] edges, int v, int e)

    {

        List<List<Integer>> adj = new ArrayList<>();     // adjaceny list

        int n = edges.length;

 

        int vis[] = new int[v];

 

    // representing graph in form of adjecency list-:

        for(int i=0; i<v;i++){

            adj.add(new ArrayList<>());

        }

        for(int i=0; i<n; i++){

            int x = edges[i][0];

            int y = edges[i][1];

            adj.get(x).add(y);

        }

 

    // For each vertex we will check its path is it forms cycle or not

        for(int i=0; i<v; i++){

           if( checkCycle(i, vis, adj) == true ) return true;

        }

        return false;

    }

} 