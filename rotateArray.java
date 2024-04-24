import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
         ArrayList<Integer> res= new ArrayList<>();
          int n= arr.size();
           for( int i=k;i<n;i++){
                res.add(arr.get(i));
           }
            for( int j=0;j<k;j++){
                 res.add(arr.get(j));
            }
            return res;
    }
}