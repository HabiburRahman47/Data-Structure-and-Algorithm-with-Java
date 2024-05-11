package org.example.array;

import java.util.Arrays;

public class RemoveEven {

    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] removeEvenNubmer(int[] arr){
        int n = arr.length;
        int oddNumber=0;
        for (int i=0;i<n;i++){
            if(arr[i]%2 !=0){
                oddNumber++;
            }
        }
        int[] result = new int[oddNumber];
        int index=0;
        for (int i=0;i<n;i++){
            if (arr[i] % 2 != 0){
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {2,5,8,3,1,4,12,7};
        printArray(arr);
        int[] result = removeEvenNubmer(arr);
        printArray(result);

    }
}
