package Array;

import java.util.*;
  import java.io.*;

  public class binarySearch {
      public static void main(String args[]) throws IOException {
          int arr[] = { 5, 7, 10, 12, 15, 20, 27, 31, 36, 42, 55, 58, 60, 65, 70, 80 };
          System.out.println(binary(arr, 55));

      }

      public static int binary(int a[], int x) {

          int low = 0;
          int high = a.length - 1;

          while (low <= high) {
              int mid = (low + high) / 2;

              if (a[mid] < x) {
                  low = mid + 1;
              } else if (a[mid] > x) {
                  high = mid - 1;
              } else {
                  return mid;
              }
          }

          return -1;
      }

  }

  //try with 55 and 6

  //  log2(16)=4 comparison
