import java.util.ArrayList;
import java.util.Stack;



public class Solution {
    public static ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> edges) {
        // Wri<>
         Stack<Integer> st= new Stack<>();
          ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
           ArrayList<ArrayList<Integer>> list= new ArrayList<>();
            for( int i=0;i<v;i++){
                  list.add(new ArrayList<Integer>());
                   
            }
             for( int i=0;i<edges.size();i++){
                   int vertice= edges.get(i).get(0);
                    int Edge= edges.get(i).get(1);
                     list.get(vertice).add(Edge);
                      list.get(Edge).add(vertice);

             }
              boolean visited[]= new boolean[list.size()];
                for( int i=0;i<v;i++){
                      if(!visited[i]){
                            st.push(i);
                             ArrayList<Integer>temp= new ArrayList<>();
                               while(!st.isEmpty()){
                                     int element= st.peek();
                                      st.pop();
 if(!visited[element]){
       visited[element]= true;
        temp.add(element);

 } for( int j=0;j<list.get(element).size();j++){
       if(!visited[list.get(element).get(j)]){
             st.push(list.get(element).get(j));
       }
 }
                               }
                                ans.add(temp);
                      }
                }
                 return ans;
    }
}