package org.example.array;

public class ResizeArray {
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] resizeArray(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for (int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println("Original array");
        printArray(arr);
        System.out.println("Resized array:");
        arr = resizeArray(arr,arr.length*2);
        printArray(arr);

    }
}
