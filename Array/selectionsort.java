
package Array;

import java.util.*;
  import java.io.*;

  public class selectionsort {
      public static void main(String args[]) throws IOException {
          int arr[] = { 99,88,66,77,55};
          selection(arr);
          
          for (int i = 0; i < arr.length; i++) {
              System.out.println(arr[i]);
          }
      }


     
      public static void selection(int[] a) {

          for (int i = 0; i < a.length - 1; i++) {
              int min = i;
              for (int j = i + 1; j <= a.length - 1; j++) {
                  if (a[j] < a[min]) {
                      min = j;
                  }

              }
              int temp = a[i];
                  a[i] = a[min];
                  a[min] = temp;
        }
         
                 }
          }
          
          
      

      
  

  //try with 55 and 6

  //  log2(16)=4 comparison
