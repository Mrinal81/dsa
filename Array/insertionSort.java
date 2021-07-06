
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

                int n = a.length;
                for (int i = 1; i < n; i++) {
                    int key = a[i];
                    int j = i - 1;
        
                    
                    while (j >= 0 && a[j] > key) {
                        a[j + 1] = a[j];
                        j = j - 1;
                    }
                    a[j + 1] = key;
                }

        }

        
          
      }


     
      
          
          
          
      

      
  

  //try with 55 and 6

  //  log2(16)=4 comparison
