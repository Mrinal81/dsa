package Array;

import java.util.*;
import java.io.*;

public class bubbleSort {
    public static void main(String args[]) throws IOException {
        int arr[] = { 88, 66, 55, 44, 22 };
        bubble(arr);
        int arr2[] = { 88, 66, 22, 77, 55, 107, 777 };
        bubble(arr2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < arr2.length; i++) {  
            System.out.print(arr2[i] + " ");  
        }  
        
    }

    public static void bubble(int[] a) {
        int n = a.length;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                     a[j]=a[j+1];
                     a[j+1]=temp;
                }
            }
        }

          
      }
    
}
