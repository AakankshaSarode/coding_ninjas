
import java.util.* ;
import java.io.*; 

public class LargestElement {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
 int largest= arr[0];
  for(int i=0;i<n;i++){
       largest=Math.max(arr[i], largest);
  }
  return largest;
    }
}
