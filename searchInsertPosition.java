public class Solution {
    public static int searchInsert(int [] arr, int m){
        // Write your code here.
  
           int low=0;

        int high=arr.length-1;

        while(low<=high){

            int mid = low+(high-low)/2;

            if(arr[mid]==m)return mid;

            if(arr[mid]>m)high=mid-1;

            else low=mid+1;

            

       }

       return low;

    }
}
