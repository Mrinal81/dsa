package Array;

import java.util.*;
import java.io.*;

public class lowerbound {

    public static void main(String args[]) throws IOException {
        int arr[] = { 1,2,2,2,2,2,2,4,5,6,7,8,9 };
        System.out.println(lower(arr, 2));

        
    }
      
    public static int lower(int a[], int x) {
        int low = 0, high = a.length - 1;
        int ans=-1;
        while (low <= high) {
           int mid = (low + high) / 2;
            if (a[mid] == x) {
                ans = mid;
                high = mid - 1;
            }
            else if (x < a[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return ans;
    }
    }
    

