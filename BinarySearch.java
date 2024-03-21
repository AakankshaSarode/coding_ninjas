public class Solution {
    public static int search(int []nums, int target) {
        // Write your code here.
     int s=0;
      int e=nums.length-1;
       int ans=0;
         while(s<=e){
              int mid= (s+e)/2;
               if(target> nums[mid]){
                    s= mid+1;
         

               }
                else if( target<nums[mid]){
                     e=mid-1;
              

                }
                 else {
                      return mid;

                 }
            

         }
               return -1;
       
    }
}
