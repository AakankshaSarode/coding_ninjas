import java.util.*;
public class mergeSorted {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
         int i=0;
          int j=0;
           List<Integer> ls= new ArrayList<>();
            while(i<a.length && j<b.length){
                 if(a[i]<b[j]){
                      ls.add(a[i]);
                       i++;

                 } else if(b[j]<a[i]){
                      ls.add(b[j]);
                      j++;

                 } else{
                      ls.add(a[i]);
                      i++;
                      j++;
                 }
            }
             while(i<a.length){
                  if(a[i]!=a[i-1]){
                       ls.add(a[i]);
                  }
                  i++;
             } while(j<b.length){
                 if(b[j]!=b[j-1]){
                     ls.add(b[j]);
                 }
                 j++;

            }
            List<Integer>result= new ArrayList<>();
             result.add(ls.get(0));
              for(int k=1;k<ls.size();k++){
                   if(!ls.get(k).equals(ls.get(k-1))){
                       result.add(ls.get(k));
                   }
              }
              return result;
    }
}