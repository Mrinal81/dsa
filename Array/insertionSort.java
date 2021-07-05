
package Array;

import java.util.*;
  import java.io.*;

  public class insertionSort {
      public static void main(String args[]) throws IOException {
          int arr[] = { 99, 88, 66, 77, 55 };
          insertion(arr);

          for (int i = 0; i < arr.length; i++) {
              System.out.println(arr[i]);
          }
      }
      

      public static void insertion(int[] a) {

        for(int i=1;i<a.length;i++){
            int val = a[i];
            int j = i - 1;
            while (j>=0 && a[j] > val) {
                a[j + 1] = a[j];
                j--;

            }
            a[j + 1] = val;
        }
          
      }


     
      
          }
          
          
      

      
  

  //try with 55 and 6

  //  log2(16)=4 comparison
