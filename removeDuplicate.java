
public class removeDuplicate {
     public static int removeDuplicates(int[] arr,int n) {
         // Write your code here.
          int j=1;
           for( int i=1;i<n;i++){
                if(arr[i]!=arr[i-1]){
                     arr[j]=arr[i];
                     j++;
                }
           }
           return j;
     }
 }