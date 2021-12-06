

package twoarraypermutation;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class TwoArrayPermutation {

    
    
    static boolean permute(Integer a[], int b[],int n, int k)
{
    // Sort the array a[] in decreasing order.
    Arrays.sort(a, Collections.reverseOrder());
 
    // Sort the array b[] in increasing order.
    Arrays.sort(b);
 
    // Checking condition on each index.
    for (int i = 0; i < n; i++)
    if (a[i] + b[i] < k)
        return false;
 
    return true;
}
    
    
    
    

    public static void main(String[] args) {
   
        
    Integer a[] = {2, 1, 3};
    int b[] = {7, 8, 9};
    int k = 10;
    int n = a.length;
 
    if (permute(a, b, n, k))
    System.out.print("Yes");
    else
    System.out.print("No");
    
    
    
}
        
//        int k=10;
//        String y="yes";
//        String n="no";
//        
//        int[] A={1,2,3};
//        int[] B={9,8,7};
//        
//           Arrays.sort(A);
//           Arrays.sort(B);
//   
//   int aIndex=0;
//   int bIndex=B.length-1;
//   
//   do
//   {
//       if(A[aIndex] + B[bIndex] < k)
//       {
//           System.out.println(n);
//           aIndex++;
//           bIndex--;
//       }
//       else
//       {
//        System.out.println(y);
//         break;
//       }
//   }while((aIndex<A.length && bIndex >= 0));
//   

//  }
    
}
