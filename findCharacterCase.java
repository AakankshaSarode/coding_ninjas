
import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
         Scanner sc= new Scanner(System.in);
          char input= sc.next().charAt(0);
           if(Character.isUpperCase(input)){
               System.out.println(1);
           } else if(Character.isLowerCase(input)){
                System.out.println(0);
           }
 else{
      System.out.println(-1);
 }
    }
}