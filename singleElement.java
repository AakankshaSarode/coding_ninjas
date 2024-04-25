public class Solution {
    public static int getSingleElement(int []arr){
        // Write your code here.
         int ans=0;
          for(int i=0;i<arr.length;i++){
               if(i+1<arr.length &&arr[i]==arr[i+1])i++;
                else{
                     ans=arr[i];
                     break;
                }
                    
               }
               return ans;
          }
    }
