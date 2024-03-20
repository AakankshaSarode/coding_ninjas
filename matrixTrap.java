
import java.util.*;
public class Solution {
    public static int matrixTraps(int n,int m, int [][]Matrix) {
        // Write your code here.
        boolean vis[][]= new boolean[n][m];
         Queue<int[]> q= new LinkedList<>();
          int[] dr={1,0,-1,0}, dc={0,-1,0,1};
           for( int i=0;i<n;i++){
                for( int j=0;j<m;j++){
                      if(i==0 || j==0 || i==n-1|| j==m-1){
                           if(Matrix[i][j]==0){
                                vis[i][j]=true;
                                 q.add(new int[]{i,j});
                           }
                      }
                }
           }
            while(!q.isEmpty()){
                 int p[]= q.poll();
                  for( int i=0;i<4;i++){
                      int r=p[0]+dr[i],c=p[1]+dc[i];
                       if(r>=0 && c>=0 && r<n && c<m &&!vis[r][c] && Matrix[r][c]==0){
                            vis[r][c]=true;
                             q.add(new int[]{r,c});

                       }
                  }
            }
             int count=0;
              for( int i=0;i<n;i++){
                   for( int j=0;j<m;j++)
                   {
                        if(!vis[i][j] && Matrix[i][j]==0)
                         count++;

                   }
              }
               return count;
    }
}