package org.example.array;

import java.util.Arrays;

public class ReversArray {
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int[] reversArray(int[] arr){
        int n = arr.length;
        int start =0;
        int end = n -1;
        int temp;
        //using for loop
//        for (int i=0;start <end ;i++){
//            temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
        //using while loop
        while (start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        printArray(arr);
        int[] result = reversArray(arr);
        printArray(result);
    }
}
