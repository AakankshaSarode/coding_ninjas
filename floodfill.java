public class Solution {
    public static int[][] floodFill(int[][] image, int n, int m, int x, int y, int p) {
        // Write your code here.
         if(image[x][y]==p)
          return image;
           dfs(x,y,image,n,m,image[x][y],p);
            return image;
    }
    static void dfs(int i , int j , int image[][] , int n , int m , int color , int newColor ){
        if(i<0 || j<0 || i>=n || j>=m || image[i][j] !=color)return;

        image[i][j] = newColor;

        dfs(i+1, j, image, n, m, color, newColor);
        dfs(i-1, j, image, n, m, color, newColor);
        dfs(i, j+1, image, n, m, color, newColor);
        dfs(i, j-1, image, n, m, color, newColor);
    }
}